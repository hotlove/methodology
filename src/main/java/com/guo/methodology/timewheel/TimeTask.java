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

    private int delay;

    // 第几个索引
    private int index;

    // 第几圈
    private int roundNum;

    // 执行内容
    private Object content;

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
