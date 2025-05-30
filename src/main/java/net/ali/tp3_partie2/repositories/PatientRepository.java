package net.ali.tp3_partie2.repositories;

import net.ali.tp3_partie2.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Page <Patient> findByNomContains(String keyword, Pageable pageable);


}
