package com.vigliom.erpsolvedbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "terceros")
public class Tercero implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Basic
    @Column(name = "apellido1", length = 45)
    private String apellido1;

    @Basic
    @Column(name = "apellido2", length = 45)
    private String apellido2;

    @Basic
    @Column(name = "email", length = 45)
    private String email;

    @Basic
    @Column(name = "direccion", nullable = false, length = 500)
    private String direccion;

    @Basic
    @Column(name = "direccion2", length = 500)
    private String direccion2;

    @Basic
    @Column(name = "direccion3", length = 500)
    private String direccion3;

    @Basic
    @Column(name = "cif", length = 45)
    private String cif;
    @Basic
    @Column(name = "cliente", nullable = false)
    private Boolean cliente;
    @Basic
    @Column(name = "prov", nullable = false)
    private Boolean prov;

    public Tercero() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tercero tercero)) return false;
        return id == tercero.id && Objects.equals(name, tercero.name) && Objects.equals(apellido1, tercero.apellido1) && Objects.equals(apellido2, tercero.apellido2) && Objects.equals(email, tercero.email) && Objects.equals(direccion, tercero.direccion) && Objects.equals(direccion2, tercero.direccion2) && Objects.equals(direccion3, tercero.direccion3) && Objects.equals(cif, tercero.cif) && Objects.equals(cliente, tercero.cliente) && Objects.equals(prov, tercero.prov);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, apellido1, apellido2, email, direccion, direccion2, direccion3, cif, cliente, prov);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getDireccion3() {
        return direccion3;
    }

    public void setDireccion3(String direccion3) {
        this.direccion3 = direccion3;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Boolean getCliente() {
        return cliente;
    }

    public void setCliente(Boolean cliente) {
        this.cliente = cliente;
    }

    public Boolean getProv() {
        return prov;
    }

    public void setProv(Boolean prov) {
        this.prov = prov;
    }
}
