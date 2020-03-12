package com.example.Practice1.repository;

import com.example.Practice1.beans.TblQmInspectionCharacteristicTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface CharacteristicsTypeRepository extends JpaRepository<TblQmInspectionCharacteristicTypes,Integer> {



}
