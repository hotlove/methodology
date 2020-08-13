package com.guo.methodology.timewheel;

/**
 * @Date: 2020/8/13 16:19
 * @Author 郭乐建
 * @Since JDK 1.8
 * @Description:
 */
public class DelayTimerTask extends AbstractTimerTask{
    @Override
    public void execute() {
        System.out.println("执行任务");
    }
}
