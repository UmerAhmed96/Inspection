package com.example.Practice1.repository;

import com.example.Practice1.beans.TblQmInspectionCharacteristicMethods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacteristicsMethodRepository extends JpaRepository<TblQmInspectionCharacteristicMethods,Integer> {
}
