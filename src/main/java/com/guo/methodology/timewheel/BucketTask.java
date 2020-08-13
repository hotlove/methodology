package com.guo.methodology.timewheel;

/**
 * @Date: 2020/8/12 17:51
 * @Author 郭乐建
 * @Since JDK 1.8
 * @Description:
 */
public class BucketTask {
    protected BucketTask next;

    protected BucketTask prev;

    private int roundNum = 0;

    private int bucketIndex = 0;

    private int type; // 0普通任务 1头节点 2尾节点

    private AbstractTimerTask timerTask;

    public BucketTask() {}

    public BucketTask(int type) {
        this.type = type;
    }
    public int getRoundNum() {
        return roundNum;
    }

    public void setRoundNum(int roundNum) {
        this.roundNum = roundNum;
    }

    public int getBucketIndex() {
        return bucketIndex;
    }

    public void setBucketIndex(int bucketIndex) {
        this.bucketIndex = bucketIndex;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public AbstractTimerTask getTimerTask() {
        return timerTask;
    }

    public void setTimerTask(AbstractTimerTask timerTask) {
        this.timerTask = timerTask;
    }
}
