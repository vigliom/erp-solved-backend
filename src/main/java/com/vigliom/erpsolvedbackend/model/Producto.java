package com.vigliom.erpsolvedbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "descripcion")
    private Descripcion descripcion;

    @ManyToOne
    @JoinColumn(name = "familia")
    private Familia familia;

    @ManyToOne
    @JoinColumn(name = "iva")
    private Iva iva;

    @Basic
    @Column(name = "precio")
    private float precio;

    @Basic
    @Column(name = "qty")
    private float qty;

    @Basic
    @Column(name = "fecha_in")
    private Date fechaIn;

    @Basic
    @Column(name = "fecha_out")
    private Date fechaOut;

    public Producto() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto producto)) return false;
        return Float.compare(producto.precio, precio) == 0 && Float.compare(producto.qty, qty) == 0 && Objects.equals(id, producto.id) && Objects.equals(descripcion, producto.descripcion) && Objects.equals(familia, producto.familia) && Objects.equals(iva, producto.iva) && Objects.equals(fechaIn, producto.fechaIn) && Objects.equals(fechaOut, producto.fechaOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion, familia, iva, precio, qty, fechaIn, fechaOut);
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Descripcion descripcion) {
        this.descripcion = descripcion;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Iva getIva() {
        return iva;
    }

    public void setIva(Iva iva) {
        this.iva = iva;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }

    public Date getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(Date fechaIn) {
        this.fechaIn = fechaIn;
    }

    public Date getFechaOut() {
        return fechaOut;
    }

    public void setFechaOut(Date fechaOut) {
        this.fechaOut = fechaOut;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
}
