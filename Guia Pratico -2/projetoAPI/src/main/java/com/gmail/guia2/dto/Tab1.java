package com.gmail.guia2.dto;

import javax.persistence.*;


public class Tab1 {
    // -----------------------tab1-----------------------------------

    private Long id;

    private String veiculo;

    private double fatorMult;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public double getFatorMult() {
        return fatorMult;
    }

    public void setFatorMult(double fatorMult) {
        this.fatorMult = fatorMult;
    }

}
