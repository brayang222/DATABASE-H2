package com.brayanvargas.recursocomputadores.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "computador")
public class Computador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serial;
    private String marca;
    private String modelo;

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
