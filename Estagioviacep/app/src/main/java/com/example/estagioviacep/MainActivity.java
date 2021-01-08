package com.example.estagioviacep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextView textoRua;
    private TextView textoBairro;
    private TextView textoCidade;
    private TextView textoEstado;
    private TextView textoCEP;
    private TextInputLayout inputRua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoRua = findViewById(R.id.textRua);
        textoBairro = findViewById(R.id.textBairro);
        textoCidade = findViewById(R.id.textCidade);
        textoEstado = findViewById(R.id.textEstado);
        textoCEP = findViewById(R.id.textCep);
        inputRua = findViewById(R.id.textInputLayout);
    }
}