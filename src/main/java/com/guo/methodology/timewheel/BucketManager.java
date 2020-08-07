package com.guo.methodology.timewheel;

/**
 * @Date: 2020/8/5 17:29
 * @Author 郭乐建
 * @Since JDK 1.8
 * @Description:
 */
public class BucketManager {
    protected TimeTask head;

    protected TimeTask tail;

    public BucketManager() {
        head = new TimeTask();
        tail = new TimeTask();

        head.next = tail;
        tail.prev = head;
    }
    // 任务总数
    private int taskTotal;

    public int getTaskTotal() {
        return taskTotal;
    }

    public void setTaskTotal(int taskTotal) {
        this.taskTotal = taskTotal;
    }
}
