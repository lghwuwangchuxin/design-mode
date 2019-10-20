package com.design.mode.designmode.factorypattern.entity;

/**
 * @ClassName OperationAdd
 * @Description:除法类
 * @Author lgh
 * @Date 2019/10/20
 **/
public class OperationDiv extends Operation {

    @Override
    public double GetResult() throws Exception {
        double result=0;
        if(this.getNumberB()==0){
            throw new Exception("除数不能为零");
        }
        result=this.getNumberA()/this.getNumberB();
        return result;
    }
}
