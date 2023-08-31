package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class conceito3 extends AppCompatActivity {

    private Button botao_avancar, botao_avanccar, botao_avancccar, botao_voltar, botao_volttar, botao_voltttar, botao_finalizar;
    private ImageView img_conc_2;
    private TextView text_conc_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_conceito3);
        getSupportActionBar().hide();
        IniciarComponentes();


        botao_avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_conc_2.setText("COM ELAS, ADIDIONAMOS OU RETIRAMOS DE UM NÚMERO.");
                img_conc_2.setImageResource(R.drawable.img_adc_sub);
                botao_avancar.setVisibility(View.INVISIBLE);
                botao_avanccar.setVisibility(View.VISIBLE);
                botao_voltar.setVisibility(View.VISIBLE);


            }
        });

        botao_avanccar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_conc_2.setText("A ADIÇÃO É UTILIZADA QUANDO QUEREMOS JUNTAR QUANTIDADES.");
                img_conc_2.setImageResource(R.drawable.img_soma_canetas);
                botao_avancar.setVisibility(View.INVISIBLE);
                botao_avanccar.setVisibility(View.INVISIBLE);
                botao_voltar.setVisibility(View.INVISIBLE);
                botao_volttar.setVisibility(View.VISIBLE);
                botao_avancccar.setVisibility(View.VISIBLE);

            }
        });

        botao_avancccar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_conc_2.setText("A SUBTRAÇÃO É UTILIZADA QUANDO QUEREMOS TIRAR UMA QUANTIDADE DA OUTRA.");
                img_conc_2.setImageResource(R.drawable.img_sub_notas);
                botao_avancar.setVisibility(View.INVISIBLE);
                botao_avanccar.setVisibility(View.INVISIBLE);
                botao_voltar.setVisibility(View.INVISIBLE);
                botao_volttar.setVisibility(View.INVISIBLE);
                botao_voltttar.setVisibility(View.VISIBLE);
                botao_avancccar.setVisibility(View.INVISIBLE);
                botao_finalizar.setVisibility(View.VISIBLE);

            }
        });

        botao_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_conc_2.setText("ADIÇÃO E SUBTRAÇÃO SÃO OS NOMES DE 2 OPERAÇÕES MATEMÁTICAS.");
                img_conc_2.setImageResource(R.drawable.img_black_tchr);
                botao_avancar.setVisibility(View.VISIBLE);
                botao_avanccar.setVisibility(View.INVISIBLE);
                botao_voltar.setVisibility(View.INVISIBLE);


            }
        });

        botao_volttar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_conc_2.setText("COM ELAS, ADIDIONAMOS OU RETIRAMOS DE UM NÚMERO.");
                img_conc_2.setImageResource(R.drawable.img_adc_sub);
                botao_avancar.setVisibility(View.INVISIBLE);
                botao_avanccar.setVisibility(View.VISIBLE);
                botao_voltar.setVisibility(View.VISIBLE);
                botao_volttar.setVisibility(View.INVISIBLE);
                botao_avancccar.setVisibility(View.INVISIBLE);

            }
        });

        botao_voltttar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_conc_2.setText("A ADIÇÃO É UTILIZADA QUANDO QUEREMOS JUNTAR QUANTIDADES.");
                img_conc_2.setImageResource(R.drawable.img_soma_canetas);
                botao_avancar.setVisibility(View.INVISIBLE);
                botao_avanccar.setVisibility(View.INVISIBLE);
                botao_voltar.setVisibility(View.INVISIBLE);
                botao_volttar.setVisibility(View.VISIBLE);
                botao_voltttar.setVisibility(View.INVISIBLE);
                botao_avancccar.setVisibility(View.VISIBLE);



            }
        });

        botao_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(conceito3.this, conceitos_menu.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponentes() {

        botao_avancar = findViewById(R.id.botao_avancar_3);
        img_conc_2 = findViewById(R.id.img_conc_3);
        text_conc_2 = findViewById(R.id.text_conc_3);
        botao_avanccar = findViewById(R.id.botao_avanccar_3);
        botao_avancccar = findViewById(R.id.botao_avancccar_3);
        botao_voltar = findViewById(R.id.botao_voltar_3);
        botao_volttar = findViewById(R.id.botao_volttar_3);
        botao_voltttar = findViewById(R.id.botao_voltttar_3);
        botao_finalizar = findViewById(R.id.botao_finalizar_3);
    }
}