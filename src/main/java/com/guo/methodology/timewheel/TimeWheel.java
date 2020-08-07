package com.guo.methodology.timewheel;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.apache.tomcat.util.bcel.Const;

import javax.sound.midi.Soundbank;
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

    private BucketManager[] arr = new BucketManager[15];

    private int currentPos = 0;

    private final int BASE_SEC = 15;

    private int totalSec = 0;

    public void putTask(TimeTask timeTask) {
        System.out.println("curpos------"+currentPos);
        // 获取任务延迟秒数
        int delay = timeTask.getDelay();

        // 15s一圈
        int roudNum = delay / BASE_SEC; // 获取第几圈

        // 索引要从当游标往后

        // 判断是否大于base_sec
        int index = delay % BASE_SEC + currentPos;
        if (index >= BASE_SEC) {
            index = index - BASE_SEC;
        }


        timeTask.setIndex(index);
        timeTask.setRoundNum(roudNum);

        BucketManager bucketManager = arr[index];
        if (bucketManager == null) {
            BucketManager bucketManager1 = new BucketManager();
            bucketManager1.tail.prev.next = timeTask;
            timeTask.next = bucketManager1.tail;
            timeTask.prev = bucketManager1.tail.prev;
            bucketManager1.tail.prev = timeTask;
            System.out.println("init index-----------"+index);
            arr[index] = bucketManager1;
        } else {
            bucketManager.tail.prev.next = timeTask;
            timeTask.next = bucketManager.tail;
            timeTask.prev = bucketManager.tail.prev;
            bucketManager.tail.prev = timeTask;
        }
    }

    public void start() {
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            currentPos++;
            totalSec++;
            System.out.println("sec:----------"+totalSec);
            if (currentPos >= 15) {
                currentPos = 0;
            }
            workerPool.execute(() -> {
                handle(currentPos);
            });
        }, 0, 1, TimeUnit.SECONDS);
    }

    private void handle(int index) {
        System.out.println("index-------------"+index);
        BucketManager bucketManager = arr[index];
        System.out.println("handle------------"+bucketManager);
        if (bucketManager != null) {
            TimeTask timeTask = bucketManager.head;
            while (timeTask.next != null) {
                TimeTask task = timeTask.next;
                if (task.getRoundNum() == 0) {
                    System.out.println("任务执行--------------"+task.getContent());
                }
                // 每转一圈圈数减一 为0时执行任务
                task.setRoundNum(task.getRoundNum() - 1);
                timeTask = task;
            }
        }
    }

}
