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
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String placacar;
    private String modelocar;

    public Usuario() {
    }

    public Usuario(String codigo, String fileira, String posicao, String disp) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.placacar = placacar;
        this.modelocar = modelocar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPlacacar() {
        return placacar;
    }

    public void setPlacacar(String placacar) {
        this.placacar = placacar;
    }

    public String getModelocar() {
        return modelocar;
    }

    public void setModelocar(String modelocar) {
        this.modelocar = modelocar;
    }
}