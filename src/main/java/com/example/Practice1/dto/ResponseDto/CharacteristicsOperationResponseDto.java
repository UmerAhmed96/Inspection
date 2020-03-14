package com.example.Practice1.dto.ResponseDto;

import com.example.Practice1.beans.TblQmInspectionCharacteristicMethods;
import com.example.Practice1.beans.TblQmInspectionCharacteristics;

import java.util.Date;

public class CharacteristicsOperationResponseDto {

    private Integer getCharacteristicsOperationId;
    private TblQmInspectionCharacteristics characteristicsId;
    private Integer characteristicsMethodId;
    private Integer characteristicsPlanOperationId;
    private Integer samplingProcedureId;
    private Integer active;

    private Date createDate;

    private Date updateDate;

    public Integer getGetCharacteristicsOperationId() {
        return getCharacteristicsOperationId;
    }

    public void setGetCharacteristicsOperationId(Integer getCharacteristicsOperationId) {
        this.getCharacteristicsOperationId = getCharacteristicsOperationId;
    }

    public TblQmInspectionCharacteristics getCharacteristicsId() {
        return characteristicsId;
    }

    public void setCharacteristicsId(TblQmInspectionCharacteristics characteristicsId) {
        this.characteristicsId = characteristicsId;
    }

    public Integer getCharacteristicsMethodId() {
        return characteristicsMethodId;
    }

    public void setCharacteristicsMethodId(Integer characteristicsMethodId) {
        this.characteristicsMethodId = characteristicsMethodId;
    }

    public Integer getCharacteristicsPlanOperationId() {
        return characteristicsPlanOperationId;
    }

    public void setCharacteristicsPlanOperationId(Integer characteristicsPlanOperationId) {
        this.characteristicsPlanOperationId = characteristicsPlanOperationId;
    }

    public Integer getSamplingProcedureId() {
        return samplingProcedureId;
    }

    public void setSamplingProcedureId(Integer samplingProcedureId) {
        this.samplingProcedureId = samplingProcedureId;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
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
}
