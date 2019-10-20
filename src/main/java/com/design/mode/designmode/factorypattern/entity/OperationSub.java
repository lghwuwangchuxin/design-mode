package com.design.mode.designmode.factorypattern.entity;

/**
 * @ClassName OperationAdd
 * @Description:减法类
 * @Author lgh
 * @Date 2019/10/20
 **/
public class OperationSub extends Operation {

    @Override
    public double GetResult() {
        double result=0;
        result=this.getNumberA()-this.getNumberB();
        return result;
    }
}
