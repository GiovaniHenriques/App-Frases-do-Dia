package com.example.appfrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarFrase(View view){

        TextView texto = findViewById(R.id.txtResultado);

        String frases[] = {
                "Nunca desista dos seus sonhos",
                "Tenha foco nos seus objetivos",
                "esteja sempre pronto pra luta",
                "A sua hora da vitoria esta chegando",
                "Fé em deus sempre"
        };
        int numero = new Random().nextInt(5);
        texto.setText(frases[numero]);
    }
}
