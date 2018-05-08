package com.example.lovkimlinh.testing;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentHome extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.home_activity,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.recy_home1);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        NewAdopter newAdopter = new NewAdopter(Set_data());
        recyclerView.setAdapter(newAdopter);


        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView=view.findViewById(R.id.recy_home);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        HomeAdapter adapter = new HomeAdapter(Set_data());
        recyclerView.setAdapter(adapter);
    }


    private EventStore[] Set_data() {

        EventStore[] eventStore = new EventStore[3];
        eventStore[0] = new EventStore("Rupp", "10/09/2018", "Phnopenh", "", "http://3.bp.blogspot.com/_oN2ovDH18dI/TNKOkWSZeVI/AAAAAAAAAJU/BMk5LbwR9a8/s1600/rupp.jpg");
        eventStore[1] = new EventStore("Ckcc", "10/09/2018", "Phnopenh", "", "http://www.koicacambodia.org/wp-content/uploads/2013/06/picture-2000x977.jpg");
        eventStore[2] = new EventStore("Cjcc", "10/09/2018", "Phnopenh", "", "http://www.cjcc.edu.kh/site/images/resized/images/cj/cjccslide_building_960_400.jpg");

        return eventStore;

    }
    }