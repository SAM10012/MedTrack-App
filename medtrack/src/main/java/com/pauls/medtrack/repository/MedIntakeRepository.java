package com.pauls.medtrack.repository;

import com.pauls.medtrack.model.MedIntakeDetails;
import com.pauls.medtrack.model.MedSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface MedIntakeRepository extends JpaRepository<MedIntakeDetails,Long> {




}
