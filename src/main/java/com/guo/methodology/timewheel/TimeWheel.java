package com.guo.methodology.timewheel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Date: 2020/8/5 17:15
 * @Author 郭乐建
 * @Since JDK 1.8
 * @Description:
 */
public class TimeWheel {

    ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    ExecutorService workerPool = Executors.newFixedThreadPool(5);

    private final int BASE_SEC = 8;

    private WheelBucket[] wheel = new WheelBucket[BASE_SEC];

    private int currentPos = 0;


    private int totalSec = 0;

    public void newDelayTask(int delay, AbstractTimerTask timerTask) {
        // 圈数
        int roundNum = (delay + currentPos) / BASE_SEC;
        // 桶索引
        int bucketIndex = (delay + currentPos) % BASE_SEC ;
        if (bucketIndex == currentPos) {
            // 如果一圈后还是当前位置（延迟基数秒），就减减
            roundNum--;
        }

        System.out.println("roundNum--------------"+roundNum);
        System.out.println("bucketIndex-----------"+bucketIndex);

        BucketTask bucketTask = new BucketTask();
        bucketTask.setBucketIndex(bucketIndex);
        bucketTask.setRoundNum(roundNum);
        bucketTask.setTimerTask(timerTask);

        WheelBucket wheelBucket = wheel[bucketIndex];
        if (wheelBucket == null) {
            WheelBucket newWheelBucket = new WheelBucket();
            newWheelBucket.tail.prev.next = bucketTask;
            bucketTask.next = newWheelBucket.tail;
            bucketTask.prev = newWheelBucket.tail.prev;
            newWheelBucket.tail.prev = bucketTask;
            wheel[bucketIndex] = newWheelBucket;
        } else {
            wheelBucket.tail.prev.next = bucketTask;
            bucketTask.next = wheelBucket.tail;
            bucketTask.prev = wheelBucket.tail.prev;
            wheelBucket.tail.prev = bucketTask;
        }
    }

    public void start() {
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            currentPos++;
            totalSec++;
            System.out.println("sec:----------"+totalSec);
            if (currentPos == BASE_SEC) {
                currentPos = 0;
            }
            workerPool.execute(() -> {
                handle(currentPos);
            });
        }, 0, 1, TimeUnit.SECONDS);
    }

    private void handle(int index) {
        System.out.println("into index-------------"+index);
        WheelBucket wheelBucket = wheel[index];
        if (wheelBucket != null) {
            BucketTask timeTask = wheelBucket.head;

            while (timeTask.next != null) {
                BucketTask task = timeTask.next;
                if (task.getType() == 2) {
                    // 如果是尾节点则直接跳出
                    break;
                }
                System.out.println("execute roundnum---"+task.getRoundNum());
                if (task.getRoundNum() == 0) {
                    task.getTimerTask().execute();
                }
                // 每转一圈圈数减一 为0时执行任务
                task.setRoundNum(task.getRoundNum() - 1);
                timeTask = task;
            }
        }
    }

}
