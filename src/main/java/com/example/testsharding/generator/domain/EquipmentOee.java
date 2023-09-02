package com.example.testsharding.generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@TableName(value = "equipment_oee")
public class EquipmentOee implements Serializable {
    @TableId(value = "serial_no", type = IdType.ASSIGN_ID)
    private Long serialNo;

    @TableField(value = "equipment_id")
    private String equipmentId;

    @TableField(value = "statistics_cycle")
    private String statisticsCycle;

    @TableField(value = "statistics_time")
    private String statisticsTime;

    @TableField(value = "lastest_status_serial_no")
    private Long lastestStatusSerialNo;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EquipmentOee other = (EquipmentOee) that;
        return (this.getSerialNo() == null ? other.getSerialNo() == null : this.getSerialNo().equals(other.getSerialNo()))
                && (this.getEquipmentId() == null ? other.getEquipmentId() == null : this.getEquipmentId().equals(other.getEquipmentId()))
                && (this.getStatisticsCycle() == null ? other.getStatisticsCycle() == null : this.getStatisticsCycle().equals(other.getStatisticsCycle()))
                && (this.getStatisticsTime() == null ? other.getStatisticsTime() == null : this.getStatisticsTime().equals(other.getStatisticsTime()))
                && (this.getLastestStatusSerialNo() == null ? other.getLastestStatusSerialNo() == null : this.getLastestStatusSerialNo().equals(other.getLastestStatusSerialNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSerialNo() == null) ? 0 : getSerialNo().hashCode());
        result = prime * result + ((getEquipmentId() == null) ? 0 : getEquipmentId().hashCode());
        result = prime * result + ((getStatisticsCycle() == null) ? 0 : getStatisticsCycle().hashCode());
        result = prime * result + ((getStatisticsTime() == null) ? 0 : getStatisticsTime().hashCode());
        result = prime * result + ((getLastestStatusSerialNo() == null) ? 0 : getLastestStatusSerialNo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        String sb = getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", serialNo=" + serialNo +
                ", equipmentId=" + equipmentId +
                ", statisticsCycle=" + statisticsCycle +
                ", statisticsTime=" + statisticsTime +
                ", lastestStatusSerialNo=" + lastestStatusSerialNo +
                ", serialVersionUID=" + serialVersionUID +
                "]";
        return sb;
    }
}