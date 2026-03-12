package com.pauls.medtrack.repository;

import com.pauls.medtrack.model.MedIntakeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedIntakeRepository extends JpaRepository<MedIntakeDetails,Long> {
}
