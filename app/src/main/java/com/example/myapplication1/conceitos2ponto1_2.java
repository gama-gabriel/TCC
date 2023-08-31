package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class conceitos2ponto1_2 extends AppCompatActivity {

    private Button botao_avancar1e2, botao_avancar3e4, botao_avancar5e6, botao_avancar7e8, botao_avancar9e10, botao_finalizar;
    private ImageView img_num_esq, img_num_dir, img_expl_esq, img_expl_dir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_conceitos2ponto12);
        getSupportActionBar().hide();
        IniciarComponentes();

        botao_avancar1e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                img_num_esq.setImageResource(R.drawable.img_num3);
                img_num_dir.setImageResource(R.drawable.img_num4);
                img_expl_esq.setImageResource(R.drawable.img_expl3);
                img_expl_dir.setImageResource(R.drawable.img_expl4);
                botao_avancar1e2.setVisibility(View.INVISIBLE);
                botao_avancar3e4.setVisibility(View.VISIBLE);


            }
        });

        botao_avancar3e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                img_num_esq.setImageResource(R.drawable.img_num5);
                img_num_dir.setImageResource(R.drawable.img_num6);
                img_expl_esq.setImageResource(R.drawable.img_expl5);
                img_expl_dir.setImageResource(R.drawable.img_expl6);
                botao_avancar1e2.setVisibility(View.INVISIBLE);
                botao_avancar3e4.setVisibility(View.INVISIBLE);
                botao_avancar5e6.setVisibility(View.VISIBLE);


            }
        });

        botao_avancar5e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                img_num_esq.setImageResource(R.drawable.img_num7);
                img_num_dir.setImageResource(R.drawable.img_num8);
                img_expl_esq.setImageResource(R.drawable.img_expl7);
                img_expl_dir.setImageResource(R.drawable.img_expl8);
                botao_avancar1e2.setVisibility(View.INVISIBLE);
                botao_avancar3e4.setVisibility(View.INVISIBLE);
                botao_avancar5e6.setVisibility(View.INVISIBLE);
                botao_avancar7e8.setVisibility(View.VISIBLE);


            }
        });

        botao_avancar7e8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                img_num_esq.setImageResource(R.drawable.img_num9);
                img_num_dir.setImageResource(R.drawable.img_num10);
                img_expl_esq.setImageResource(R.drawable.img_expl9);
                img_expl_dir.setImageResource(R.drawable.img_expl10);
                botao_avancar1e2.setVisibility(View.INVISIBLE);
                botao_avancar3e4.setVisibility(View.INVISIBLE);
                botao_avancar5e6.setVisibility(View.INVISIBLE);
                botao_avancar7e8.setVisibility(View.INVISIBLE);
                botao_avancar9e10.setVisibility(View.VISIBLE);



            }
        });

        botao_avancar9e10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                botao_avancar9e10.setVisibility(View.INVISIBLE);
                botao_finalizar.setVisibility(View.VISIBLE);


            }
        });

        botao_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(conceitos2ponto1_2.this, conceitos_menu_2.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponentes() {
        botao_avancar1e2 = findViewById(R.id.botao_avancar2_2_1e2);
        botao_avancar3e4 = findViewById(R.id.botao_avancar2_2_3e4);
        botao_avancar5e6 = findViewById(R.id.botao_avancar2_2_5e6);
        botao_avancar7e8 = findViewById(R.id.botao_avancar2_2_7e8);
        botao_avancar9e10 = findViewById(R.id.botao_avancar2_2_9e10);
        img_num_dir = findViewById(R.id.img_num_dir);
        img_num_esq = findViewById(R.id.img_num_esq);
        img_expl_dir = findViewById(R.id.img_expl_dir);
        img_expl_esq = findViewById(R.id.img_expl_esq);
        botao_finalizar = findViewById(R.id.botao_finalizar_2_1_2);


    }
}