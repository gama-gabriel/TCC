package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {

    private Button botao_calculadora,botao_desafios,botao_conceitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_menu);
        IniciarBotoes();
        botao_calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this,Calculadora.class);
                startActivity(intent);
            }
        });

        botao_conceitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this,conceitos_menu.class);
                startActivity(intent);
            }
        });

        botao_desafios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, desafios_tela.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarBotoes() {
        botao_conceitos = findViewById(R.id.concepts_button);
        botao_desafios = findViewById(R.id.chall_button);
        botao_calculadora =findViewById(R.id.calc_button);


    }

}
