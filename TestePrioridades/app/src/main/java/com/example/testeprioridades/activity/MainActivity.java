package com.example.testeprioridades.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.testeprioridades.R;
import com.example.testeprioridades.adapter.Adapter;
import com.example.testeprioridades.model.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Model> listaModel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recyclerView);

        this.models();

        //Configurar Adapter
        Adapter adapter = new Adapter( listaModel );

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( getApplicationContext());
        recyclerView.setLayoutManager( layoutManager );
        recyclerView.setHasFixedSize( true );
        recyclerView.addItemDecoration( new DividerItemDecoration( this, LinearLayout.VERTICAL));
        recyclerView.setAdapter( adapter );
    }

    public void abrirDialog(View view){

    }

    public void models(){

        Model model = new Model("Limpar a casa" , "Lembrar de lavar a casa toda" , "30/11/2020 09:00");
        listaModel.add(model);

        model = new Model("Limpar a casa" , "Lembrar de lavar a casa toda" , "30/11/2020 09:00");
        listaModel.add(model);

    }

}