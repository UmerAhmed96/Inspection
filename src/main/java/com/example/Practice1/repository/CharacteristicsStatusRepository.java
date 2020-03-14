package com.example.Practice1.repository;

import com.example.Practice1.beans.TblQmInspectionCharacteristicStatuses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacteristicsStatusRepository extends JpaRepository<TblQmInspectionCharacteristicStatuses,Integer> {

}
