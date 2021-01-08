package com.example.motivosparaamar;

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

    public void gerarNovaFrase(View view){

            String[] frases = {
                    "Você é mais do que eu sonhei, nunca imaginei ter alguém como você!",
                    "Meu amor, desejo que hoje o seu dia seja especial... assim como você é para mim. Te amo!",
                    "Eu amo te admirar, as vezes me pego te observando dormir, observando a sua respiração e pensando no quanto quero estar com vc...  e isso acontece muito pois tu ama dormir.",
                    "Uma vida inteira contigo ainda seria pouco.",
            };
            int numero = new Random().nextInt(4);

            TextView texto = findViewById(R.id.fraseGerada);
            texto.setText(frases[numero]);

    }
}