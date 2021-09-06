/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema;

public class Funcionario extends Pessoa{
    private int privilégio = 0;
    private String cliente;

    public Funcionario(String nome, String login, String senha, int privilégio) {
        super(nome, login, senha);
        this.privilégio = privilégio;
    }

    public int getPrivilégio() {
        return privilégio;
    }
    public void funcao(String name) {
        this.cliente = name;
    }
}