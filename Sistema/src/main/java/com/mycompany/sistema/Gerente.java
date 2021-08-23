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
public class Gerente extends Pessoa{
    private int privilégio;
     public Gerente(String nome, String login, String senha, int privilégio) {
        super(nome, login, senha);
        this.privilégio = privilégio;
    }
     public int getPrivilégio() {
        return privilégio;
    }
    public void funcao(String name) {
        super.setNome(name);
    }
    public String StaffMensage() {
        String mensagem =("Permissão para alterar concedida a: "+super.getNome());
        return mensagem;
    }
}
