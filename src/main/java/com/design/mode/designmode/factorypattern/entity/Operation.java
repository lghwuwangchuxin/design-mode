package com.design.mode.designmode.factorypattern.entity;

import lombok.Data;

/**
 * @ClassName Operation
 * @Description:运算类/使用工厂模式实现计算器加减乘除功能
 * @Author lgh
 * @Date 2019/10/20
 **/
@Data
public  abstract class Operation {
    private double numberA=0;
    private double numberB=0;
    public abstract double GetResult() throws Exception;

}
