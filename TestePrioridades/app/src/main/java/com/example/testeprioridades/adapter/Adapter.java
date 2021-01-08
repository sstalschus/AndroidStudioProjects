package com.example.testeprioridades.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testeprioridades.R;
import com.example.testeprioridades.model.Model;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Model> listaModel;

    public Adapter(List<Model> lista) {
        this.listaModel = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from( parent.getContext() ).inflate(R.layout.adapterlista, parent, false);

        return new MyViewHolder( itemLista );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Model model = listaModel.get( position);
        holder.titulo.setText( model.getTitulo());
        holder.descricao.setText(model.getDescricao());
        holder.data.setText(model.getData());

    }

    @Override
    public int getItemCount() {
        return listaModel.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titulo;
        TextView descricao;
        TextView data;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo      = itemView.findViewById(R.id.textTitulo);
            descricao   = itemView.findViewById(R.id.textGenero);
            data        = itemView.findViewById(R.id.textAno);

        }
    }

}
