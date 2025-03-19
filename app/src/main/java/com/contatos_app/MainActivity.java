package com.contatos_app;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Log.i("Contato","Iniciando chat");

        Pessoal amiga = new Pessoal("Joana", "joana@gmail.com", 994956879, "14/02/2005");
        Profissional chefe = new Profissional("Arnaldo", "contatoArnaldo@gmail.com", 78788080,"Americanas","Chefe");

        amiga.exibirDetalhes();
        amiga.conversar();

        chefe.exibirDetalhes();
        chefe.discutir();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}