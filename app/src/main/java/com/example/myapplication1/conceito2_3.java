package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class conceito2_3 extends AppCompatActivity {

    private Button botao_avancar, botao_avanccar, botao_avancccar, botao_voltar, botao_volttar, botao_voltttar, botao_finalizar;
    private ImageView img_conc_2;
    private TextView text_conc_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_conceito23);
        getSupportActionBar().hide();
        IniciarComponentes();

        botao_avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_conc_2.setText("AO ACRESCENTAR UNIDADES AO NÚMERO 10, FORMAMOS NÚMEROS AINDA MAIORES!");
                img_conc_2.setImageResource(R.drawable.img_11e12);
                botao_avancar.setVisibility(View.INVISIBLE);
                botao_avanccar.setVisibility(View.VISIBLE);
                botao_voltar.setVisibility(View.VISIBLE);


            }
        });

        botao_avanccar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_conc_2.setText("ALÉM DAS UNIDADES, TAMBÉM PODEMOS ACRESCENTAR DEZENAS, CHEGANDO À NÚMEROS CADA VEZ MAIORES!");
                img_conc_2.setImageResource(R.drawable.img_20e31);
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

                text_conc_2.setText("CADA NÚMERO DE DEZENAS RECEBE UM NOME. ELES SÃO OS SEGUINTES:");
                img_conc_2.setImageResource(R.drawable.img_dezenas_nomes);
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

                text_conc_2.setText("PODEMOS REPRESENTAR O NÚMERO DEZ COMO 10 UNIDADES OU 1 DEZENA.");
                img_conc_2.setImageResource(R.drawable.img_10un1dez);
                botao_avancar.setVisibility(View.VISIBLE);
                botao_avanccar.setVisibility(View.INVISIBLE);
                botao_voltar.setVisibility(View.INVISIBLE);


            }
        });

        botao_volttar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_conc_2.setText("AO ACRESCENTAR UNIDADES AO NÚMERO 10, FORMAMOS NÚMEROS AINDA MAIORES!");
                img_conc_2.setImageResource(R.drawable.img_11e12);
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

                text_conc_2.setText("ALÉM DAS UNIDADES, TAMBÉM PODEMOS ACRESCENTAR DEZENAS, CHEGANDO À NÚMEROS CADA VEZ MAIORES!");
                img_conc_2.setImageResource(R.drawable.img_20e31);
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
                Intent intent = new Intent(conceito2_3.this, conceitos_menu_2.class);
                startActivity(intent);
            }
        });





    }
    private  void IniciarComponentes(){

        botao_avancar = findViewById(R.id.botao_avancar2_3);
        img_conc_2 = findViewById(R.id.img_conc_2_3);
        text_conc_2 = findViewById(R.id.text_conc_2_3);
        botao_avanccar = findViewById(R.id.botao_avanccar_2_3);
        botao_avancccar = findViewById(R.id.botao_avancccar_2_3);
        botao_voltar = findViewById(R.id.botao_voltar_2_3);
        botao_volttar = findViewById(R.id.botao_volttar_2_3);
        botao_voltttar = findViewById(R.id.botao_voltttar_2_3);
        botao_finalizar = findViewById(R.id.botao_finalizar_2_3);
    }
}