package com.example.Practice1.dto.RequestDto;

public class CharacteristicsSamplesRequestDto {

    private String indicatorCharacteristicSampleCode;

    private Integer inspectionCharacteristicId;

    private Integer samplingProcedureId;

    private Integer active;

    public String getIndicatorCharacteristicSampleCode() {
        return indicatorCharacteristicSampleCode;
    }

    public void setIndicatorCharacteristicSampleCode(String indicatorCharacteristicSampleCode) {
        this.indicatorCharacteristicSampleCode = indicatorCharacteristicSampleCode;
    }

    public Integer getInspectionCharacteristicId() {
        return inspectionCharacteristicId;
    }

    public void setInspectionCharacteristicId(Integer inspectionCharacteristicId) {
        this.inspectionCharacteristicId = inspectionCharacteristicId;
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

}
