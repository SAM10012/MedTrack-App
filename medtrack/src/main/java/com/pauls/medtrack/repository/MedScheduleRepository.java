package com.pauls.medtrack.repository;

import com.pauls.medtrack.model.MedSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedScheduleRepository extends JpaRepository<MedSchedule,Long> {


}
