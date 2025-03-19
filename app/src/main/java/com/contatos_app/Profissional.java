package com.contatos_app;

import android.util.Log;

public class Profissional extends  Contatos{

    protected String nomeEmpresa, cargo;
    public Profissional(String nome, String email, int numero, String nomeEmpresa, String cargo){
        super(nome, email, numero);
    }

    public void discutir(){
    Log.i("Contato","Nome: " + nome + "Discutindo sobre trabalho");
    }


}
