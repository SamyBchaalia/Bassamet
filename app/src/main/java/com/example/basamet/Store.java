package com.example.basamet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Store extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<ListStore> listStores= new ArrayList<>();
    StoreAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        recyclerView=findViewById(R.id.recyclerView5);

        listStores.add(new ListStore("chachia" , 100 ,R.drawable.chachia));
        listStores.add(new ListStore("chachia" , 100 ,R.drawable.chachia));
        listStores.add(new ListStore("chachia" , 100 ,R.drawable.chachia));

        adapter =new StoreAdapter(listStores, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);





    }
}