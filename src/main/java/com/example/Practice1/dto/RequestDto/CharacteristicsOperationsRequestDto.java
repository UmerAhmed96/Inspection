package com.example.Practice1.dto.RequestDto;


public class CharacteristicsOperationsRequestDto {


    private Integer characteristicsId;
    private Integer characteristicsMethodId;
    private Integer characteristicsPlanOperationId;
    private Integer samplingProcedureId;
    private Integer active;

    private String createDate;

    private String updateDate;

    public Integer getCharacteristicsId() {
        return characteristicsId;
    }

    public void setCharacteristicsId(Integer characteristicsId) {
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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
