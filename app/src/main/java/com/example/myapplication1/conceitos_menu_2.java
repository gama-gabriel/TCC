package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class conceitos_menu_2 extends AppCompatActivity {

    private CheckBox check_1, check_2, check_3;
    private Button botao_continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_conceitos_menu2);
        getSupportActionBar().hide();
        IniciarComponentes();

        check_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check_1.isChecked())
                {
                    check_2.setChecked(false);
                    check_3.setChecked(false);

                }

            }
        });

        check_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check_2.isChecked())
                {
                    check_1.setChecked(false);
                    check_3.setChecked(false);

                }

            }
        });

        check_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check_3.isChecked())
                {
                    check_2.setChecked(false);
                    check_1.setChecked(false);


                }

            }
        });

        botao_continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check_1.isChecked())
                {
                    Intent intent = new Intent(conceitos_menu_2.this, conceito2ponto1.class);
                    startActivity(intent);

                }

                if (check_2.isChecked())
                {
                    Intent intent = new Intent(conceitos_menu_2.this, conceito2_2.class);
                    startActivity(intent);

                }

                if (check_3.isChecked())
                {
                    Intent intent = new Intent(conceitos_menu_2.this, conceito2_3.class);
                    startActivity(intent);

                }


            }
        });


        };




    private void IniciarComponentes(){

        check_1 = findViewById(R.id.check_2_1);
        check_2 = findViewById(R.id.check_2_2);
        check_3 = findViewById(R.id.check_2_3);
        botao_continuar = findViewById(R.id.botao_continuar_2);

    }




}