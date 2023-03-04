package com.vigliom.erpsolvedbackend.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "iva")
public class Iva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private float id;

    @Basic
    @Column(name = "valor")
    private float valor;

    public Iva() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Iva iva)) return false;
        return Float.compare(iva.id, id) == 0 && Float.compare(iva.valor, valor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valor);
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
