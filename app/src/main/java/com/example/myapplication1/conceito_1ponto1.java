package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class conceito_1ponto1 extends AppCompatActivity {

    private Button botao_avancar, botao_avanccar, botao_avancccar;
    private ImageView img_conc_1;
    private TextView text_conc_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_conceito1ponto1);
        getSupportActionBar().hide();
        IniciarComponentes();

        botao_avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (botao_avancar.getText().equals("Avançar"))
                {
                text_conc_1.setText("ELA APARECE DE DIVERSAS FORMAS, COMO NÚMEROS, MEDIDAS, FIGURAS E GRÁFICOS.");
                img_conc_1.setImageResource(R.drawable.img_expl1);
                botao_avancar.setVisibility(View.INVISIBLE);
                botao_avanccar.setVisibility(View.VISIBLE);
                }

            }
        });

        botao_avanccar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_conc_1.setText("VAMOS APRENDER UM POUCO MAIS SOBRE COMO A MATEMÁTICS FUNCIONA!");
                img_conc_1.setImageResource(R.drawable.happy_boy);
                botao_avanccar.setVisibility(View.INVISIBLE);
                botao_avancccar.setVisibility(View.VISIBLE);
            }
        });

        botao_avancccar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(conceito_1ponto1.this, conceitos_menu.class);
                startActivity(intent);
            }
        });
    }


    private void IniciarComponentes() {
        botao_avancar = findViewById(R.id.botao_avancar);
        img_conc_1 = findViewById(R.id.img_conc_1);
        text_conc_1 = findViewById(R.id.text_conc_1);
        botao_avanccar = findViewById(R.id.botao_avanccar);
        botao_avancccar = findViewById(R.id.botao_avancccar);

    }
}
