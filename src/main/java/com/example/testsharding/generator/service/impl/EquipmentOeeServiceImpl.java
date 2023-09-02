package com.example.testsharding.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testsharding.generator.domain.EquipmentOee;
import com.example.testsharding.generator.mapper.EquipmentOeeMapper;
import com.example.testsharding.generator.service.EquipmentOeeService;
import org.springframework.stereotype.Service;

@Service
public class EquipmentOeeServiceImpl extends ServiceImpl<EquipmentOeeMapper, EquipmentOee> implements EquipmentOeeService {
    @Override
    public void test01() {
        EquipmentOee oee = new EquipmentOee();
        oee.setEquipmentId("ab");
        oee.setStatisticsCycle("A");
        oee.setStatisticsTime("202308121052");
        oee.setLastestStatusSerialNo(1L);
        save(oee);
    }

}




