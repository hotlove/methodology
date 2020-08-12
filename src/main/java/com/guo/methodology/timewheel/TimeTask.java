package com.guo.methodology.timewheel;

/**
 * @Date: 2020/8/5 17:15
 * @Author 郭乐建
 * @Since JDK 1.8
 * @Description:
 */
public class TimeTask {

    protected TimeTask prev;

    protected TimeTask next;

    private int type = 0; // 0普通任务 1头节点 2尾节点

    private int delay;

    // 第几个索引
    private int index;

    // 第几圈 每转动一圈roundNum减一，等减少0的时候出队列执行任务
    private int roundNum;

    // 执行内容
    private Object content;

    public TimeTask() {};

    public TimeTask(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getRoundNum() {
        return roundNum;
    }

    public void setRoundNum(int roundNum) {
        this.roundNum = roundNum;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

}
