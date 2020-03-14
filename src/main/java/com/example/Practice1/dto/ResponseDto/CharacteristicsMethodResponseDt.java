package com.example.Practice1.dto.ResponseDto;

import com.example.Practice1.beans.TblQmInspectionCharacteristics;

import java.util.Date;

public class CharacteristicsMethodResponseDt {

    private TblQmInspectionCharacteristics inspectionCharacteristicId;
    private Integer inspectionMethodId;
    private Integer active;
    private Date updateDate;
    private Date createDate;

    public TblQmInspectionCharacteristics getInspectionCharacteristicId() {
        return inspectionCharacteristicId;
    }

    public void setInspectionCharacteristicId(TblQmInspectionCharacteristics inspectionCharacteristicId) {
        this.inspectionCharacteristicId = inspectionCharacteristicId;
    }

    public Integer getInspectionMethodId() {
        return inspectionMethodId;
    }

    public void setInspectionMethodId(Integer inspectionMethodId) {
        this.inspectionMethodId = inspectionMethodId;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
