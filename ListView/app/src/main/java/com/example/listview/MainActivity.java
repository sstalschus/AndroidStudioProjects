package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {
            "Ir ao dentista", "Encomendar bolo aniversário",
            "Comprar presente de aniversário", "Programar passeio com família",
            "Desenvolver projeto da faculdade", "Desativação da torre Se Jiboia",
            "Marcar consulta cirurgia", "Marcar aulas práticas CNH",
            "Desativação de baterias", "Atividade BD I e Arq. Comp.",
            "Fazer jejum", "Ler a bíblia", "Parar de tomar omeprazol",
            "Manter alimentação saudável", "Pular corda", "Comprar roupas para natal",
            "Ir visitar Samara", "Fazer curso da facul", "Enviar atividade de POO"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        //Criar adaptador de lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                itens
        );

        //Adiciona adaptador
        listLocais.setAdapter( adaptador );

        //Clique na lista
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorSelecionado = listLocais.getItemAtPosition( position ).toString();
                Toast.makeText(
                        getApplicationContext(),
                        valorSelecionado,
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }
}