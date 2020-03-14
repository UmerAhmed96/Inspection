package com.example.Practice1.beans;
 import org.springframework.data.jpa.domain.support.AuditingEntityListener;
 import javax.persistence.*;
 import java.util.Date;


@Entity
@Table(name = "tbl_qm_inspection_characteristic_methods")
@EntityListeners(AuditingEntityListener.class)
public class TblQmInspectionCharacteristicMethods {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "inspection_characteristic_method_id")
    private Integer inspectionCharacteristicMethodId;

    @ManyToOne
    @JoinColumn(name = "inspection_characteristic_id")
    private TblQmInspectionCharacteristics inspectionCharacteristicId;


    @Column(name = "inspection_method_id")
    private Integer inspectionMethodId;

    @Column(name="active")
    private Integer active;

    @Column(name ="create_date")
    private Date createDate;

    @Column(name = "update_Date")
    private Date updateDate;

    public Integer getInspectionCharacteristicMethodId() {
        return inspectionCharacteristicMethodId;
    }

    public void setInspectionCharacteristicMethodId(Integer inspectionCharacteristicMethodId) {
        this.inspectionCharacteristicMethodId = inspectionCharacteristicMethodId;
    }

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

