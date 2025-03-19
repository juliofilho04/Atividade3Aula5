package com.contatos_app;

import android.util.Log;

public class Pessoal extends Contatos{

    protected String aniversario;

    public Pessoal(String nome, String email, int numero, String aniversario){
        super(nome,email,numero);
    }

    public void conversar(){
        Log.i("Contato", "Conversar");
    }

}
