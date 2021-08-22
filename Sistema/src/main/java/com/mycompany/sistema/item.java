/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema;

/**
 *
 * @author micka
 */
public class item {
    private String nome;
    private int quantidade,barras;
    private double valor;

    public item(String nome, int quantidade, int barras, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.barras = barras;
        this.valor = valor;
    }

    

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public int getBarras() {
        return barras;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
