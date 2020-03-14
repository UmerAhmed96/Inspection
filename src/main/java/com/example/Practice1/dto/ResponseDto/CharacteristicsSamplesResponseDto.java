package com.example.Practice1.dto.ResponseDto;

import com.example.Practice1.beans.TblQmInspectionCharacteristics;

import java.util.Date;

public class CharacteristicsSamplesResponseDto {
    private String indicatorCharacteristicSampleCode;

    private TblQmInspectionCharacteristics inspectionCharacteristicId;

    private Integer samplingProcedureId;

    private Date createDate;
    private Date updateDate;
    private Integer active;

    public String getIndicatorCharacteristicSampleCode() {
        return indicatorCharacteristicSampleCode;
    }

    public void setIndicatorCharacteristicSampleCode(String indicatorCharacteristicSampleCode) {
        this.indicatorCharacteristicSampleCode = indicatorCharacteristicSampleCode;
    }

    public TblQmInspectionCharacteristics getInspectionCharacteristicId() {
        return inspectionCharacteristicId;
    }

    public void setInspectionCharacteristicId(TblQmInspectionCharacteristics inspectionCharacteristicId) {
        this.inspectionCharacteristicId = inspectionCharacteristicId;
    }

    public Integer getSamplingProcedureId() {
        return samplingProcedureId;
    }

    public void setSamplingProcedureId(Integer samplingProcedureId) {
        this.samplingProcedureId = samplingProcedureId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}
