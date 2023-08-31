package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {

    private Button botao_um,botao_dois,botao_tres,botao_quatro,botao_cinco,botao_seis,botao_sete,botao_oito,botao_nove,botao_zero,botao_virgula,botao_clear,botao_igual,botao_soma,botao_subtracao,botao_multiplicacao,botao_divisao,settings;
    private ImageView botao_backspace;
    private TextView text_conta,text_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_landscape);
        IniciarComponentes();
        getSupportActionBar().hide();
        botao_um.setOnClickListener(this);
        botao_dois.setOnClickListener(this);
        botao_tres.setOnClickListener(this);
        botao_quatro.setOnClickListener(this);
        botao_cinco.setOnClickListener(this);
        botao_seis.setOnClickListener(this);
        botao_sete.setOnClickListener(this);
        botao_oito.setOnClickListener(this);
        botao_nove.setOnClickListener(this);
        botao_zero.setOnClickListener(this);
        botao_soma.setOnClickListener(this);
        botao_subtracao.setOnClickListener(this);
        botao_multiplicacao.setOnClickListener(this);
        botao_divisao.setOnClickListener(this);
        botao_virgula.setOnClickListener(this);

        botao_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_conta.setText("");
                text_resultado.setText("");

            }
        });

        botao_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView conta = findViewById(R.id.text_conta);
                String string = conta.getText().toString();

                if(!string.isEmpty()){

                    byte var0 = 0;
                    int var1 = string.length()-1;
                    String textConta = string.substring(var0,var1);
                    conta.setText(textConta);
                }
                text_resultado.setText("");
            }
        });

        botao_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    {
                        Expression expressao = new ExpressionBuilder(text_conta.getText().toString()).build();
                        double resultado =expressao.evaluate();
                        long longresult = (long) resultado;


                        if (resultado == (double)longresult)
                        {
                            text_resultado.setText((CharSequence) String.valueOf(longresult));
                            text_conta.setText(" ");

                        }
                        else
                        {
                            text_resultado.setText((CharSequence) String.valueOf(resultado));                }
                    }
                }
                catch (Exception e){

                }
            }


        });
    }

    private void IniciarComponentes(){
        botao_zero = findViewById(R.id.botao_zero);
        botao_um = findViewById(R.id.botao_um);
        botao_dois = findViewById(R.id.botao_dois);
        botao_tres = findViewById(R.id.botao_tres);
        botao_quatro = findViewById(R.id.botao_quatro);
        botao_cinco = findViewById(R.id.botao_cinco);
        botao_seis = findViewById(R.id.botao_seis);
        botao_sete = findViewById(R.id.botao_sete);
        botao_oito = findViewById(R.id.botao_oito);
        botao_nove = findViewById(R.id.botao_nove);
        botao_virgula = findViewById(R.id.botao_virgula);
        botao_clear = findViewById(R.id.botao_clear);
        botao_igual = findViewById(R.id.botao_igual);
        botao_soma = findViewById(R.id.botao_soma);
        botao_subtracao = findViewById(R.id.botao_subtracao);
        botao_multiplicacao = findViewById(R.id.botao_multiplicacao);
        botao_divisao = findViewById(R.id.botao_divisao);
        settings = findViewById(R.id.settings);
        text_conta = findViewById(R.id.text_conta);
        text_resultado = findViewById(R.id.text_resultado);
        botao_backspace = findViewById(R.id.botao_backspace);

    }

    public void AcrescentarUmaExpressao(String string,boolean limpar_dados)
    {
        if(text_resultado.getText().equals(""))
        {
            text_conta.setText(" ");

        }

        if(limpar_dados)
        {
            text_resultado.setText(" ");
            text_conta.append(string);
        } else
         {
             text_conta.append(text_resultado.getText());
             text_conta.append(string);
             text_resultado.setText(" ");
         }


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.botao_um:
                AcrescentarUmaExpressao("1",true);
                break;

            case R.id.botao_dois:
                AcrescentarUmaExpressao("2",true);
                break;

            case R.id.botao_tres:
                AcrescentarUmaExpressao("3",true);
                break;

            case R.id.botao_quatro:
                AcrescentarUmaExpressao("4",true);
                break;

            case R.id.botao_cinco:
                AcrescentarUmaExpressao("5",true);
                break;

            case R.id.botao_seis:
                AcrescentarUmaExpressao("6",true);
                break;

            case R.id.botao_sete:
                AcrescentarUmaExpressao("7",true);
                break;

            case R.id.botao_oito:
                AcrescentarUmaExpressao("8",true);
                break;

            case R.id.botao_nove:
                AcrescentarUmaExpressao("9",true);
                break;

            case R.id.botao_zero:
                AcrescentarUmaExpressao("0",true);
                break;

            case R.id.botao_virgula:
                AcrescentarUmaExpressao(".",true);
                break;

            case R.id.botao_soma:
                AcrescentarUmaExpressao("+ ",false);
                break;

            case R.id.botao_subtracao:
                AcrescentarUmaExpressao("- ",false);
                break;

            case R.id.botao_multiplicacao:
                AcrescentarUmaExpressao("* ",false);
                break;

            case R.id.botao_divisao:
                AcrescentarUmaExpressao("/ ",false);
                break;
        }


    }
}