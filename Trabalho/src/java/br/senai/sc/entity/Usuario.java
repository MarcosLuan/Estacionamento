/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.entity;

/**IÎ||«|
 *
 * @author andersonfrare
 */
public class Usuario {
    
    private String VPlaca;
    private String VNome;
<<<<<<< HEAD
    private String VHentrada;
    private String VHsaida;
    private int tempo;
    
=======
>>>>>>> parent of 6b9a421... calcula tempo

    public Usuario() {
    }

    public Usuario(String VPlaca, String VNome) {
        this.VPlaca = VPlaca;
        this.VNome = VNome;
    }

    
    public Usuario(String VPlaca, String VNome, String VHentrada, String VHsaida, int tempo) {
        this.VPlaca = VPlaca;
        this.VNome = VNome;
        this.VHentrada = VHentrada;
        this.VHsaida = VHsaida;
        this.tempo = tempo;
    }
    

    public String getVHentrada() {
        return VHentrada;
    }

    public void setVHentrada(String VHentrada) {
        this.VHentrada = VHentrada;
    }

    public String getVHsaida() {
        return VHsaida;
    }

    public void setVHsaida(String VHsaida) {
        this.VHsaida = VHsaida;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    
    
    public String getVPlaca() {
        return VPlaca;
    }

    public void setVPlaca(String VPlaca) {
        this.VPlaca = VPlaca;
    }

    public String getVNome() {
        return VNome;
    }

    public void setVNome(String VNome) {
        this.VNome = VNome;
    }

    public double calcularValorPagemento() {
    
        return tempo * 0.05;
    }
    
    
}
