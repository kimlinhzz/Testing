package com.example.lovkimlinh.testing;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;
import java.util.zip.Inflater;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{

    protected List<GiveData> giveDatas ;

    public MainAdapter(List<GiveData> giveDatas) {
        this.giveDatas= giveDatas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sub_recyler_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        GiveData giveData = giveDatas.get(position);
        holder.textname.setText(giveData.getName());
        holder.textdesc.setText(giveData.getDesc());
        Glide.with(holder.imageView.getContext())
                .load(giveData.getProfile())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {

        return giveDatas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textname,textdesc;
        private ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img_profile);
            textdesc = itemView.findViewById(R.id.text_recyler);
            textname = itemView.findViewById(R.id.Desc_recyler);
        }
    }
}