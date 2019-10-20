package com.design.mode.designmode.factorypattern.factory;

import com.design.mode.designmode.factorypattern.entity.*;

/**
 * @ClassName OperationFactory
 * @Description:工厂类
 * @Author lgh
 * @Date 2019/10/20
 **/
public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation oper=null;
        switch (operate)
        {
            case "+":
                oper=new OperationAdd();
                break;
            case "-":
                oper=new OperationSub();
                break;
            case "*":
                oper=new OperationMul();
                break;
            case "/":
                oper=new OperationDiv();
                break;
        }
        return oper;
    }
}
