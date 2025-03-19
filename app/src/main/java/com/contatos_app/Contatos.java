package com.contatos_app;

import android.util.Log;

public abstract class Contatos implements Contato {

    protected String nome, email;
    protected int numero;

    public Contatos(String nome, String email, int numero){
        this.nome = nome;
        this.email = email;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getNumero() {
        return numero;
    }

    public void exibirDetalhes(){
        Log.i("Contato","Nome: " + nome + ", Email: " + email + ", Numero: " + numero);
    }

}
