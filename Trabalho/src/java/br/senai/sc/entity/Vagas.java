
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.entity;

/**IÎ||«|
 *
 * @author Erik
 */
public class Vagas {
    

    private String VPlaca;
    private String VNome;
    private String VHentrada;
    private String VHsaida;
    private double VHcusto;
    private int tempo;
    private String Vreservada;
    private int Pago;

    public String getVreservada() {
        return Vreservada;
    }

    public void setVreservada(String Vreservada) {
        this.Vreservada = Vreservada;
    }
    
    
    
    public Vagas() {
    }

    public Vagas(String VPlaca, String VNome,String Vreservada) {
        this.VPlaca = VPlaca;
        this.VNome = VNome;
        this.Vreservada =Vreservada ;
    }

    public Vagas(String VPlaca, String VNome, String VHentrada, String VHsaida, int tempo, String Vreservada) {
        this.VPlaca = VPlaca;
        this.VNome = VNome;
        this.VHentrada = VHentrada;
        this.VHsaida = VHsaida;
        this.tempo = tempo;
        this.Vreservada = Vreservada;
    }

    public Vagas(String VPlaca, String VNome, String VHentrada, String VHsaida, double VHcusto, int tempo, String Vreservada, int Pago) {
        this.VPlaca = VPlaca;
        this.VNome = VNome;
        this.VHentrada = VHentrada;
        this.VHsaida = VHsaida;
        this.VHcusto = VHcusto;
        this.tempo = tempo;
        this.Vreservada = Vreservada;
        this.Pago = Pago;
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

    public double getVHcusto() {
        return VHcusto;
    }

    public void setVHcusto(double VHcusto) {
        this.VHcusto = VHcusto;
    }
    
    public int getPago() {
        return Pago;
    }

    public void setPago(int Pago) {
        this.Pago = Pago;
    }
    
    

    public double calcularValorPagamento() {
    
        return tempo * 0.05;
    }
    
   
}
