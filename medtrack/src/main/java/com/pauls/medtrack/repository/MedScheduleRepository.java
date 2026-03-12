package com.pauls.medtrack.repository;

import com.pauls.medtrack.model.MedSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedScheduleRepository extends JpaRepository<MedSchedule,Long> {
}
