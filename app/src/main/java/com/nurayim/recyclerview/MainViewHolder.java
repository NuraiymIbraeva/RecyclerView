package com.nurayim.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {



    TextView textView;
    TextView number;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_name);
        number = itemView.findViewById(R.id.number);

    }

    public void onBind(ItemModel data) {
        textView.setText(data.name);
        number.setText(String.valueOf(data.count));

    }
}
