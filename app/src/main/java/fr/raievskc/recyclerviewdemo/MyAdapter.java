package fr.raievskc.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    // Fake data this adapter use to update small views that will be displayed by the RecyclerView
    List<String> donnees;

    public MyAdapter(List<String> data) {
        donnees = data;
    }

    // Method called by the RecyclerView when a brand new (not recycled) ViewHolder is needed.
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_row_item, parent, false);

        return new MyViewHolder(view);
    }

    // Method that update the existing given ViewHolder according to the given 'position'
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.getNom().setText(String.valueOf(position));
        holder.getDescription().setText(donnees.get(position));
    }

    @Override
    public int getItemCount() {
        return this.donnees.size();

    }

    // Internal class that holds the graphical representation of one item of data
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView nomTV;
        private final TextView descTV;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nomTV = (TextView) itemView.findViewById(R.id.nom);
            descTV = (TextView) itemView.findViewById(R.id.description);
        }

        public TextView getNom() {
            return nomTV;
        }

        public TextView getDescription() {
            return descTV;
        }
    }
}
