package com.example.lovkimlinh.testing;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class NewAdopter extends RecyclerView.Adapter<NewAdopter.NewViewHolder>{

    private EventStore [] eventStores;

    public NewAdopter(EventStore[] eventStores) {
        this.eventStores = eventStores;
    }

    @Override

    public NewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.viewholder4,parent,false);
        NewViewHolder newViewHolder= new NewViewHolder(view);
        return newViewHolder;
    }

    @Override
    public void onBindViewHolder(NewViewHolder holder, int position) {
        EventStore eventStore = eventStores[position];
        holder.txttitle2.setText(eventStore.getTitle());
        holder.txtdate.setText(eventStore.getDate());

    }

    @Override
    public int getItemCount() {
        return eventStores.length;
    }


    class NewViewHolder extends RecyclerView.ViewHolder{
       TextView txttitle2;
       TextView txtdate;
       ImageView imgrecy2;
        public NewViewHolder(View itemView) {
            super(itemView);

            txttitle2 = itemView.findViewById(R.id.hello_txt);
            imgrecy2 = itemView.findViewById(R.id.view_img);
            txtdate = itemView.findViewById(R.id.id_txt);


        }
    }
}
