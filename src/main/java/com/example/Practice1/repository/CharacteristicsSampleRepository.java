package com.example.Practice1.repository;

import com.example.Practice1.beans.TblQmIndicatorCharacteristicSamples;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacteristicsSampleRepository extends JpaRepository<TblQmIndicatorCharacteristicSamples,Integer> {


}
