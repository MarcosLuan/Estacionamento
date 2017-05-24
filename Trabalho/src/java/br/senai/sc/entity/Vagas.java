/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.entity;

/**
 *
 * @author Marcos_Laís
 */
public class Vagas {
    private String codigo;
    private String fileira;
    private String posicao;
    private String disp;

    public Vagas() {
    }

    public Vagas(String codigo, String fileira, String posicao, String status, String disp) {
        this.codigo = codigo;
        this.fileira = fileira;
        this.posicao = posicao;
        
        this.disp = disp;
    }

   
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFileira() {
        return fileira;
    }

    public void setFileira(String fileira) {
        this.fileira = fileira;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }


    public String getDisp() {
        return disp;
    }

    public void setDisp(String disp) {
        this.disp = disp;
    }

    
}
