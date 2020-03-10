package com.example.Practice1.repository;

import com.example.Practice1.beans.TblQmInspectionCharacteristics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface InspectionRepository extends JpaRepository<TblQmInspectionCharacteristics,Integer> {


}
