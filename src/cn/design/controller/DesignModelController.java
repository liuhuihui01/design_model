package cn.design.controller;

import cn.design.interfaces.FunctionInterface;
import cn.design.interfaces.OffLineState;
import cn.design.interfaces.OnlineState;
import cn.design.interfaces.State;

/**
 * Created by Administrator on 2017/2/9.
 */
public class DesignModelController implements State {
    FunctionInterface func;
    public void setstate(FunctionInterface c){
        this.func=c;
    }
    @Override
    public void onLine() {
        setstate(new OnlineState());
    }

    @Override
    public void offOnline() {
        setstate(new OffLineState());
    }

    public void run(){
        func.run();
    }
    public void play(){
        func.play();
    }
    public void driver(){
        func.driver();
    }
    public void back(){
        func.back();
    }



}
