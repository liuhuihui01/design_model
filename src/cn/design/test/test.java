package cn.design.test;


import cn.design.controller.DesignModelController;

/**
 * Created by Administrator on 2017/2/9.
 */
public class test {

    public static void main(String[] args) {
        DesignModelController controller = new DesignModelController();
        controller.onLine();
        controller.offOnline();
        controller.run();
        controller.play();
        controller.back();
        controller.driver();
    }
}
