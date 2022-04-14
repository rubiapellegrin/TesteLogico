/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testelogico;

/**
 *
 * @author rubia
 */
public class Objeto {
    private char chave;
    private int valor;

    public Objeto(char chave, int valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public char getChave() {
        return chave;
    }

    public void setChave(char chave) {
        this.chave = chave;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
