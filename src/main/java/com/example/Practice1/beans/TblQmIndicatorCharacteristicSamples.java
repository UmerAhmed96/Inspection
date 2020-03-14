package com.example.Practice1.beans;
 import org.springframework.data.jpa.domain.support.AuditingEntityListener;
 import javax.persistence.*;
 import java.util.Date;

@Entity
@Table(name = "tbl_qm_indicator_characteristic_samples")
@EntityListeners(AuditingEntityListener.class)
public class TblQmIndicatorCharacteristicSamples {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "indicator_characteristic_sample_id")
    private Integer indicatorCharacteristicSampleId;

    @Column(name = "indicator_characteristic_sample_code")
    private String indicatorCharacteristicSampleCode;

    @ManyToOne
    @JoinColumn(name = "inspection_characteristic_id")
    private TblQmInspectionCharacteristics inspectionCharacteristicId;

    @Column(name="sampling_procedure_id")
    private Integer samplingProcedureId;

    @Column(name="active")
    private Integer active;

    @Column(name ="create_date")
    private Date createDate;

    @Column(name = "update_Date")
    private Date updateDate;

    public Integer getIndicatorCharacteristicSampleId() {
        return indicatorCharacteristicSampleId;
    }

    public void setIndicatorCharacteristicSampleId(Integer indicatorCharacteristicSampleId) {
        this.indicatorCharacteristicSampleId = indicatorCharacteristicSampleId;
    }

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
