package com.example.lovkimlinh.testing;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

//Class Type
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    private  EventStore[] eventStores;

    public HomeAdapter(EventStore[] eventStores) {
        this.eventStores = eventStores;
        }
        @Override
    //work when adapter build viewholder
    public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Load View holder layout file
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.viewholder2,parent,false);
        HomeViewHolder homeViewHolder= new HomeViewHolder(view);
        return homeViewHolder;
    }

    @Override
    //get data to change View
    public void onBindViewHolder(HomeViewHolder holder, int position) {

        EventStore eventStore = eventStores[position];
        holder.txttitle.setText(eventStore.getTitle());
        holder.txtdate.setText(eventStore.getDate());
        Glide.with(holder.imgview.getContext())
                .load(eventStore.getImageurl())
                .into(holder.imgview);
    }
// Put how much recyclerView
    @Override
    public int getItemCount() {
        return eventStores.length;
    }

    class HomeViewHolder extends RecyclerView.ViewHolder{
    TextView txttitle;
    TextView txtdate;
    ImageView imgview;

        public HomeViewHolder(View itemView) {
            super(itemView);
            imgview = itemView.findViewById(R.id.view_img);
            txtdate = itemView.findViewById(R.id.id_txt);
            txttitle = itemView.findViewById(R.id.hello_txt);
        }
    }
}
