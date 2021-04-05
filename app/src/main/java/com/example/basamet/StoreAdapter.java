package com.example.basamet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ViewHolder> {

    private List<com.example.basamet.ListStore> ListStore;
    private Context context;

    public StoreAdapter(List<ListStore> listStore, Context context) {
        ListStore = listStore;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardstore,parent,false);
        return  new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListStore listStore=ListStore.get(position);
        holder.title2.setText(listStore.getTitle2());
        holder.price.setText(listStore.getPrice());
        holder.Image1.setImageResource(listStore.getImage1());

    }

    @Override
    public int getItemCount() {
        return ListStore.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
            public TextView title2;
            public TextView price;
            public ImageView Image1;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Image1=(ImageView) itemView.findViewById(R.id.imagestore) ;
            title2=(TextView) itemView.findViewById(R.id.title2);
            price=(TextView) itemView.findViewById(R.id.price);

        }
    }
}
