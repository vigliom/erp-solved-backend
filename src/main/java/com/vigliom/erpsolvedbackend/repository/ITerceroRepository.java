package com.vigliom.erpsolvedbackend.repository;

import com.vigliom.erpsolvedbackend.model.Tercero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITerceroRepository extends JpaRepository<Tercero, Long> {
}
