package com.pauls.medtrack.repository;

import com.pauls.medtrack.model.MedSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface MedScheduleRepository extends JpaRepository<MedSchedule,Long> {


    @Query("SELECT DISTINCT m.userName FROM MedSchedule m")
    List<String> findDistinctUsers();

    @Query("SELECT m FROM MedSchedule m WHERE m.userName = :user AND :date BETWEEN m.startDate AND m.endDate")
    List<MedSchedule> findMedsForToday(@Param("user") String user,
                                       @Param("date") LocalDate date);
}
