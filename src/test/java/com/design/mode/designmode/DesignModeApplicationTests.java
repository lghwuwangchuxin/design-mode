package com.design.mode.designmode;

import com.design.mode.designmode.factorypattern.entity.Operation;
import com.design.mode.designmode.factorypattern.factory.OperationFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignModeApplicationTests {

    /**
     * 工厂模式测试
     */
    @Test
    void factoryTest() throws Exception {
        Operation oper= OperationFactory.createOperate("/");
        oper.setNumberA(1);
        oper.setNumberB(2);
        double result=oper.GetResult();
        System.out.println(result);
    }

}
