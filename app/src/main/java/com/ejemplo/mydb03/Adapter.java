package com.ejemplo.mydb03;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ejemplo.mydb03.R;

import java.util.ArrayList;

/**
 * Created by missa on 07/03/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ListaViewHolder> {

    Context context;
    ArrayList<Dato> listadatos;

    public Adapter(Context context, ArrayList<Dato> listadatos) {
        this.context = context;
        this.listadatos = listadatos;
    }

    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list,null);
        return new ListaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListaViewHolder holder, int position) {
        Dato dato=listadatos.get(position);

        holder.txtId.setText(dato.getId());
        holder.txtNombre.setText(dato.getNombre());
        holder.txtSueldo.setText(dato.getSueldo());
    }

    @Override
    public int getItemCount() {
        return listadatos.size();
    }


    public class ListaViewHolder extends RecyclerView.ViewHolder {
        TextView txtId,txtNombre,txtSueldo;

        public ListaViewHolder(View itemView) {
            super(itemView);

            txtId=itemView.findViewById(R.id.txtId);
            txtNombre=itemView.findViewById(R.id.txtNombre);
            txtSueldo=itemView.findViewById(R.id.txtSueldo);
        }
    }
}
