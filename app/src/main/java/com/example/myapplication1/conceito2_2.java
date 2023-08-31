package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class conceito2_2 extends AppCompatActivity {

    private Button botao_avancar, botao_avanccar, botao_avancccar, botao_voltar, botao_volttar, botao_voltttar, botao_finalizar;
    private ImageView img_conc_2;
    private TextView text_conc_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_conceito22);
        getSupportActionBar().hide();
        IniciarComponentes();


        botao_avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text_conc_2.setText("AO COMPARAR OS NÚMEROS, PODEMOS ENTENDER A SUA ORDEM E CLASSIFICÁ-LOS EM ORDEM DE GRANDEZA. VEJA!");
                    img_conc_2.setImageResource(R.drawable.img_2_maior1);
                    botao_avancar.setVisibility(View.INVISIBLE);
                    botao_avanccar.setVisibility(View.VISIBLE);
                    botao_voltar.setVisibility(View.VISIBLE);


            }
        });

        botao_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_conc_2.setText("A TODO MOMENTO ESTAMOS COMPARANDO E COLOCANDO NÚMEROS EM ORDEM.");
                img_conc_2.setImageResource(R.drawable.abaco);
                botao_avancar.setVisibility(View.VISIBLE);
                botao_avanccar.setVisibility(View.INVISIBLE);
                botao_voltar.setVisibility(View.INVISIBLE);


            }
        });

        botao_avanccar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                img_conc_2.setImageResource(R.drawable.img_3maior2);
                botao_avancar.setVisibility(View.INVISIBLE);
                botao_avanccar.setVisibility(View.INVISIBLE);
                botao_voltar.setVisibility(View.INVISIBLE);
                botao_volttar.setVisibility(View.VISIBLE);
                botao_avancccar.setVisibility(View.VISIBLE);



            }
        });

        botao_volttar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_conc_2.setText("AO COMPARAR OS NÚMEROS, PODEMOS ENTENDER A SUA ORDEM E CLASSIFICÁ-LOS EM ORDEM DE GRANDEZA. VEJA!");
                img_conc_2.setImageResource(R.drawable.img_2_maior1);
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

                img_conc_2.setImageResource(R.drawable.img_3maior2);
                botao_avancar.setVisibility(View.INVISIBLE);
                botao_avanccar.setVisibility(View.INVISIBLE);
                botao_voltar.setVisibility(View.INVISIBLE);
                botao_volttar.setVisibility(View.VISIBLE);
                botao_voltttar.setVisibility(View.INVISIBLE);
                botao_avancccar.setVisibility(View.VISIBLE);



            }
        });


        botao_avancccar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                img_conc_2.setImageResource(R.drawable.img_1thru10);
                botao_avancar.setVisibility(View.INVISIBLE);
                botao_avanccar.setVisibility(View.INVISIBLE);
                botao_voltar.setVisibility(View.INVISIBLE);
                botao_volttar.setVisibility(View.INVISIBLE);
                botao_voltttar.setVisibility(View.VISIBLE);
                botao_avancccar.setVisibility(View.INVISIBLE);
                botao_finalizar.setVisibility(View.VISIBLE);




            }
        });

        botao_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(conceito2_2.this, conceitos_menu_2.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponentes() {

        botao_avancar = findViewById(R.id.botao_avancar2_2);
        img_conc_2 = findViewById(R.id.img_conc_2_2);
        text_conc_2 = findViewById(R.id.text_conc_2_2);
        botao_avanccar = findViewById(R.id.botao_avanccar_2_2);
        botao_avancccar = findViewById(R.id.botao_avancccar_2_2);
        botao_voltar = findViewById(R.id.botao_voltar_2_2);
        botao_volttar = findViewById(R.id.botao_volttar_2_2);
        botao_voltttar = findViewById(R.id.botao_voltttar_2_2);
        botao_finalizar = findViewById(R.id.botao_finalizar_2_2);
    }

}

