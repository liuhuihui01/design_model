package cn.design.interfaces;

/**
 * Created by Administrator on 2017/2/9.
 */
public class OffLineState implements FunctionInterface {
    @Override
    public void run() {
        System.out.println(" 不在线 run");
    }

    @Override
    public void driver() {
        System.out.println(" 不在线 driver");
    }

    @Override
    public void play() {
        System.out.println(" 不在线 play");
    }

    @Override
    public void back() {
        System.out.println(" 不在线 back");
    }
}
