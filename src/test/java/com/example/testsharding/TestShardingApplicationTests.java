package com.example.testsharding;

import com.example.testsharding.generator.service.EquipmentOeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestShardingApplicationTests {

    @Autowired
    EquipmentOeeService equipmentOeeService;

    @Test
    public void test01() {
        equipmentOeeService.test01();
    }

}
