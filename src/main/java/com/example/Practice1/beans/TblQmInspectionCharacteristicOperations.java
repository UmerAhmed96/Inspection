package com.example.Practice1.beans;

 import org.springframework.data.jpa.domain.support.AuditingEntityListener;
 import javax.persistence.*;
 import java.util.Date;

@Entity
@Table(name = "tbl_qm_inspection_characteristic_operations")
@EntityListeners(AuditingEntityListener.class)
public class TblQmInspectionCharacteristicOperations {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "inspection_characteristic_operation_id")
    private Integer inspectionCharacteristicOperationId;

    @ManyToOne
    @JoinColumn(name = "inspection_characteristic_id")
    private TblQmInspectionCharacteristics tblQmInspectionCharacteristics;

    @Column(name="inspection_method_id")
    private Integer tblQmInspectionCharacteristicMethods;

    @Column(name="inspection_plan_operation_id")
    private Integer inspectionCharacteristicPlanOperationId;

    @Column(name="sampling_procedure_id")
    private Integer samplingProcedureId;


    @Column(name="active")
    private Integer active;

    @Column(name ="create_date")
    private Date createDate;

    @Column(name = "update_Date")
    private Date updateDate;

    public Integer getInspectionCharacteristicOperationId() {
        return inspectionCharacteristicOperationId;
    }

    public void setInspectionCharacteristicOperationId(Integer inspectionCharacteristicOperationId) {
        this.inspectionCharacteristicOperationId = inspectionCharacteristicOperationId;
    }

    public TblQmInspectionCharacteristics getTblQmInspectionCharacteristics() {
        return tblQmInspectionCharacteristics;
    }

    public void setTblQmInspectionCharacteristics(TblQmInspectionCharacteristics tblQmInspectionCharacteristics) {
        this.tblQmInspectionCharacteristics = tblQmInspectionCharacteristics;
    }

    public Integer getTblQmInspectionCharacteristicMethods() {
        return tblQmInspectionCharacteristicMethods;
    }

    public void setTblQmInspectionCharacteristicMethods(Integer tblQmInspectionCharacteristicMethods) {
        this.tblQmInspectionCharacteristicMethods = tblQmInspectionCharacteristicMethods;
    }

    public Integer getInspectionCharacteristicPlanOperationId() {
        return inspectionCharacteristicPlanOperationId;
    }

    public void setInspectionCharacteristicPlanOperationId(Integer inspectionCharacteristicPlanOperationId) {
        this.inspectionCharacteristicPlanOperationId = inspectionCharacteristicPlanOperationId;
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

