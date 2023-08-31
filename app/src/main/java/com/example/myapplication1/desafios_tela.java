package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class desafios_tela extends AppCompatActivity {

    private TextView text_question, alternativa_1, alternativa_2, alternativa_3, alternativa_4;
    List<QuestionsItem> questionsItems;
    int currentQuestions = 0;
    int correct = 0, wrong = 0;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_quiz_kotlin);
        getSupportActionBar().hide();
        IniciarComponentes();
        loadAllQuestions();
        Collections.shuffle(questionsItems);
        setQuestionScreen(currentQuestions);

        alternativa_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionsItems.get(currentQuestions).getAnswer1().equals(questionsItems.get(currentQuestions).getCorrect())){

                    correct++;
                    alternativa_1.setBackgroundResource(R.color.green);
                }
                else{
                    wrong++;
                    alternativa_1.setBackgroundResource(R.color.red);

                }
                if (currentQuestions < questionsItems.size()-1){

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            currentQuestions++;
                            setQuestionScreen(currentQuestions);
                            alternativa_1.setBackgroundResource(R.color.light_blue);
                        }
                    }, 500);
                }
                else{

                    Intent intent = new Intent(desafios_tela.this, menu.class);
                    intent.putExtra("correct",correct);
                    intent.putExtra("wrong",wrong);
                    startActivity(intent);
                    finish();
                }
            }
        });


        alternativa_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionsItems.get(currentQuestions).getAnswer2().equals(questionsItems.get(currentQuestions).getCorrect())){

                    correct++;
                    alternativa_2.setBackgroundResource(R.color.green);
                }
                else{
                    wrong++;
                    alternativa_2.setBackgroundResource(R.color.red);

                }
                if (currentQuestions < questionsItems.size()-1){

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            currentQuestions++;
                            setQuestionScreen(currentQuestions);
                            alternativa_2.setBackgroundResource(R.color.light_blue);
                        }
                    }, 500);
                }
                else{

                    Intent intent = new Intent(desafios_tela.this, menu.class);
                    intent.putExtra("correct",correct);
                    intent.putExtra("wrong",wrong);
                    startActivity(intent);
                    finish();
                }
            }
        });

        alternativa_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionsItems.get(currentQuestions).getAnswer3().equals(questionsItems.get(currentQuestions).getCorrect())){

                    correct++;
                    alternativa_3.setBackgroundResource(R.color.green);
                }
                else{
                    wrong++;
                    alternativa_3.setBackgroundResource(R.color.red);

                }
                if (currentQuestions < questionsItems.size()-1){

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            currentQuestions++;
                            setQuestionScreen(currentQuestions);
                            alternativa_3.setBackgroundResource(R.color.light_blue);
                        }
                    }, 500);
                }
                else{

                    Intent intent = new Intent(desafios_tela.this, menu.class);
                    intent.putExtra("correct",correct);
                    intent.putExtra("wrong",wrong);
                    startActivity(intent);
                    finish();
                }
            }
        });

        alternativa_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionsItems.get(currentQuestions).getAnswer4().equals(questionsItems.get(currentQuestions).getCorrect())){

                    correct++;
                    alternativa_4.setBackgroundResource(R.color.green);
                }
                else{
                    wrong++;
                    alternativa_4.setBackgroundResource(R.color.red);

                }
                if (currentQuestions < questionsItems.size()-1){

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            currentQuestions++;
                            setQuestionScreen(currentQuestions);
                            alternativa_4.setBackgroundResource(R.color.light_blue);
                        }
                    }, 500);
                }
                else{

                    Intent intent = new Intent(desafios_tela.this, menu.class);
                    intent.putExtra("correct",correct);
                    intent.putExtra("wrong",wrong);
                    startActivity(intent);
                    finish();
                }
            }
        });





    }

    private void setQuestionScreen(int currentQuestions) {
        text_question.setText(questionsItems.get(currentQuestions).getQuestions());
        alternativa_1.setText(questionsItems.get(currentQuestions).getAnswer1());
        alternativa_2.setText(questionsItems.get(currentQuestions).getAnswer2());
        alternativa_3.setText(questionsItems.get(currentQuestions).getAnswer3());
        alternativa_4.setText(questionsItems.get(currentQuestions).getAnswer4());


    }

    private void loadAllQuestions() {
        questionsItems = new ArrayList<>();
        String jsonquiz = loadJsonFromAsset("questions.json");
        try {
            JSONObject jsonObject = new JSONObject(jsonquiz);
            JSONArray questions = jsonObject.getJSONArray("questions");
            for(int i=0; i < questions.length();i++){
                JSONObject  question = questions.getJSONObject(i);

                String questionsString = question.getString("question");
                String answer1String = question.getString("answer1");
                String answer2String = question.getString("answer2");
                String answer3String = question.getString("answer3");
                String answer4String = question.getString("answer4");
                String correctString = question.getString("correct");

                questionsItems.add(new QuestionsItem(questionsString, answer1String, answer2String, answer3String, answer4String, correctString));
            }
        }

        catch (JSONException e) {
            e.printStackTrace();

        }
    }

    private String loadJsonFromAsset(String s) {

        String json = "";
        try{
            InputStream inputStream = getAssets().open(s);
            int size = inputStream.available();
            byte[]buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");
        }
        catch (IOException e){

            e.printStackTrace();
        }
        return json;

    }


    private void IniciarComponentes() {

        alternativa_1 = findViewById(R.id.alternativa_1);
        alternativa_2 = findViewById(R.id.alternativa_2);
        alternativa_3 = findViewById(R.id.alternativa_3);
        alternativa_4 = findViewById(R.id.alternativa_4);
        text_question = findViewById(R.id.text_pergunta);

    }

}