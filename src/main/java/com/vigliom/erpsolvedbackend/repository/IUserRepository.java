package com.vigliom.erpsolvedbackend.repository;

import com.vigliom.erpsolvedbackend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<Usuario, Long>{
}
