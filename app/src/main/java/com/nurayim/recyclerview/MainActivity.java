package com.nurayim.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter adapter;
    ArrayList<ItemModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);
        adapter = new MainAdapter();


        recyclerView.setAdapter(adapter);


        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        list = new ArrayList<>();
        list.add(0,new ItemModel("Pepsi",1));
        list.add(1,new ItemModel("Cola",2));
        list.add(2,new ItemModel("Mirinda",3));
        list.add(3,new ItemModel("Fuse Tea",4));
        list.add(4,new ItemModel("Nitro",5));
        list.add(5,new ItemModel("Pepsi Light",6));
        list.add(6,new ItemModel("Green Tea",7));
        list.add(7,new ItemModel("Black Tea",8));
        list.add(8,new ItemModel("Red Tea",9));
        list.add(9,new ItemModel("MacCoffee",10));
        list.add(10,new ItemModel("Coffee",11));
        list.add(11,new ItemModel("Sprite",12));


        adapter.addText(list);




    }
}