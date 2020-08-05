package com.guo.methodology.timewheel;

import org.apache.tomcat.util.bcel.Const;

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

    private BucketManager[] arr = new BucketManager[15];

    private int currentPos = 0;

    private final int BASE_SEC = 15;

    public void putTask(TimeTask timeTask) {
        // 获取任务延迟秒数
        int delay = timeTask.getDelay();

        // 15s一圈
        int roudNum = delay / BASE_SEC; // 获取第一几个坑
        int index = delay % BASE_SEC; // 获取第几圈

        timeTask.setIndex(index);
        timeTask.setRoundNum(roudNum);

        BucketManager bucketManager = arr[index];

        bucketManager.tail.prev.next = timeTask;
        timeTask.prev = bucketManager.tail.prev;

        timeTask.next = bucketManager.tail;
        bucketManager.tail.prev = timeTask;
    }

    public void start() {
        scheduledExecutorService.schedule(() -> {
            currentPos = currentPos + 1;
            if (currentPos > 15) {
                currentPos = 0;
            }
        }, 1, TimeUnit.SECONDS);
    }

}
