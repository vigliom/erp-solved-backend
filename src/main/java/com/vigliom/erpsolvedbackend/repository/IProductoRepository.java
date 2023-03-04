package com.vigliom.erpsolvedbackend.repository;

import com.vigliom.erpsolvedbackend.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long> {
}
