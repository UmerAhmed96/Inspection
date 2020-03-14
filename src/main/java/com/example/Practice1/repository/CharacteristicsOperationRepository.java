package com.example.Practice1.repository;

import com.example.Practice1.beans.TblQmInspectionCharacteristicOperations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacteristicsOperationRepository extends JpaRepository<TblQmInspectionCharacteristicOperations,Integer> {
}
