package com.example.examenfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador_Historial_Envios extends RecyclerView.Adapter<Adaptador_Historial_Envios.viewholder> {

    private List<Historial_de_Envios> historial_de_envios;
    private Context context;

    public Adaptador_Historial_Envios(List<Historial_de_Envios>historial_de_envios,Context context){
        this.historial_de_envios=historial_de_envios;
        this.context=context;
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_historial_de_envios,parent,false);
         return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        holder.IdEnvio.setText(historial_de_envios.get(position).getIdEnvio());
        holder.IdUsuario.setText(historial_de_envios.get(position).getIdUsuario());
        holder.IdDepartamento.setText(historial_de_envios.get(position).getIdDepartamento());
        holder.IdProvincia.setText(historial_de_envios.get(position).getIdProvincia());
        holder.IdDistrito.setText(historial_de_envios.get(position).getIdDistrito());
        holder.CostoEnvio.setText(historial_de_envios.get(position).getCostoEnvio());




    }

    @Override
    public int getItemCount() {
        return historial_de_envios.size();
    }

    public static class viewholder extends RecyclerView.ViewHolder {
        TextView IdEnvio, IdUsuario, IdDepartamento, IdProvincia,IdDistrito,CostoEnvio;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            IdEnvio=itemView.findViewById(R.id.listar);
            IdUsuario=itemView.findViewById(R.id.listar);
            IdDepartamento=itemView.findViewById(R.id.listar);
            IdProvincia=itemView.findViewById(R.id.listar);
            IdDistrito=itemView.findViewById(R.id.listar);
            CostoEnvio=itemView.findViewById(R.id.listar);


        }
    }
}
