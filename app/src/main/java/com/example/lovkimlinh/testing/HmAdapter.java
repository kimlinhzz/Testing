package com.example.lovkimlinh.testing;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HmAdapter extends RecyclerView.Adapter<HmAdapter.HmViewHolder> {


    @Override
    public HmViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.viewholder3,parent,false);
        HmViewHolder hmViewHolder = new HmViewHolder(view);
        return hmViewHolder;
    }

    @Override
    public void onBindViewHolder(HmViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class HmViewHolder extends RecyclerView.ViewHolder{

        public HmViewHolder(View itemView) {
            super(itemView);



        }
    }
}
