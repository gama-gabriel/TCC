package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class conceito2ponto1 extends AppCompatActivity {

    private Button botao_avancar, botao_avanccar, botao_voltar;
    private ImageView img_conc_2;
    private TextView text_conc_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_conceito2ponto1);
        getSupportActionBar().hide();
        IniciarComponentes();

        botao_avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (botao_avancar.getText().equals("Avançar"))
                {
                    text_conc_2.setText("INICIALMENTE, VAMOS ENTENDER E LER OS NÚMEROS ATÉ DEZ (10).");
                    img_conc_2.setImageResource(R.drawable.abaco);
                    botao_avancar.setVisibility(View.INVISIBLE);
                    botao_avanccar.setVisibility(View.VISIBLE);
                    botao_voltar.setVisibility(View.VISIBLE);
                }

            }
        });

        botao_avanccar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(conceito2ponto1.this, conceitos2ponto1_2.class);
                startActivity(intent);
            }
        });

        botao_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    text_conc_2.setText("OS NÚMEROS ESTÃO PRESENTES EM MUITAS SITUAÇÕES DO DIA A DIA. POR ISSO, PRECISAMOS CONHECER OS NÚMEROS MUITO BEM!");
                    img_conc_2.setImageResource(R.drawable.walking);
                    botao_avancar.setVisibility(View.VISIBLE);
                    botao_avanccar.setVisibility(View.INVISIBLE);
                    botao_voltar.setVisibility(View.INVISIBLE);


            }
        });

    }

    private void IniciarComponentes() {
        botao_avancar = findViewById(R.id.botao_avancar2_1);
        img_conc_2 = findViewById(R.id.img_conc_2);
        text_conc_2 = findViewById(R.id.text_conc_2);
        botao_avanccar = findViewById(R.id.botao_avanccar_2_1);
        botao_voltar = findViewById(R.id.botao_voltar);

    }

}