package com.guo.methodology.timewheel;

/**
 * @Date: 2020/8/12 17:49
 * @Author 郭乐建
 * @Since JDK 1.8
 * @Description:
 */
public class WheelBucket {
    protected BucketTask head;

    protected BucketTask tail;

    public WheelBucket() {
        head = new BucketTask(1);
        tail = new BucketTask(2);

        head.next = tail;
        tail.prev = head;
    }
}
