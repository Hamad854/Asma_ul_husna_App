package com.learn.asma_ul_husna_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Asma_ul_husna_Adapter extends RecyclerView.Adapter<Asma_ul_husna_Adapter.ViewHolder> {
    Context context;
    String []NamesEng;
    String []NamesUrdu;

    public Asma_ul_husna_Adapter(Context context, String[] namesEng, String[] namesUrdu) {
        this.context = context;
        NamesEng = namesEng;
        NamesUrdu = namesUrdu;
    }

    @NonNull
    @Override
    public Asma_ul_husna_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View  view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_asma_ul_husna,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Asma_ul_husna_Adapter.ViewHolder holder, int position) {

        holder.txtEng.setText(NamesEng[position]);
        holder.txtUrdu.setText(NamesUrdu[position]);
    }

    @Override
    public int getItemCount() {
        return NamesEng.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtEng,txtUrdu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtEng = itemView.findViewById(R.id.asmend);
            txtUrdu=itemView.findViewById(R.id.asmurd);
        }
    }
}
