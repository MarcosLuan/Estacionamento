/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.entity;

/**
 *
 * @author andersonfrare
 */
public class Reservas {
    private String Rcod;
    private int Rocupada;

    public Reservas(String Rcod, int Rocupada) {
        this.Rcod = Rcod;
        this.Rocupada = Rocupada;
    }

    public String getRcod() {
        return Rcod;
    }

    public void setRcod(String Rcod) {
        this.Rcod = Rcod;
    }

    public int getRocupada() {
        return Rocupada;
    }

    public void setRocupada(int Rocupada) {
        this.Rocupada = Rocupada;
    }

    
}
