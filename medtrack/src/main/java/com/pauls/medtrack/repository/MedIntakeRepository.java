package com.pauls.medtrack.repository;

import com.pauls.medtrack.model.MedIntakeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedIntakeRepository extends JpaRepository<MedIntakeDetails,Long> {

    @Query("SELECT DISTINCT m.userName FROM MedSchedule m")
    List<String> findDistinctUsers();
}
