package com.example.lovkimlinh.testing;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GallaryAdopter extends RecyclerView.Adapter<GallaryAdopter.GallaryViewHolder>{


    @Override
    public GallaryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());

        return null;
    }

    @Override
    public void onBindViewHolder(GallaryViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class GallaryViewHolder extends RecyclerView.ViewHolder{
    public GallaryViewHolder(View itemView) {
        super(itemView);
    }
}
}
