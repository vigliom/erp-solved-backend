package com.vigliom.erpsolvedbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "familia")
public class Familia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Basic
    @Column(name = "descripcion", nullable = false, length = 255)
    private String descripcion;

    public Familia() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Familia familia)) return false;
        return Objects.equals(id, familia.id) && Objects.equals(name, familia.name) && Objects.equals(descripcion, familia.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, descripcion);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

}
