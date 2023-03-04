package com.vigliom.erpsolvedbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "descripcion")
public class Descripcion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Basic
    @Column(name = "descripcion", nullable = false, length = 255)
    private String descripcion;

    @Basic
    @Column(name = "image")
    private String image;

    public Descripcion() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Descripcion that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(descripcion, that.descripcion) && Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, descripcion, image);
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
