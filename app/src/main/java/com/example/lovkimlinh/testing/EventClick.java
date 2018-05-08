package com.example.lovkimlinh.testing;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class EventClick extends Fragment {


    private  RecyclerView recyclerView;
    private MainAdapter mainAdapter;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmentview, container, false);
        recyclerView = view.findViewById(R.id.recy);
        mainAdapter = new MainAdapter(GetallData());
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(mainAdapter);
   return view;
    }

    private List<GiveData> GetallData(){

         List<GiveData> giveDatas= new ArrayList<>();

      giveDatas.add(new GiveData("Mr Stone","Welcome","https://sguru.org/wp-content/uploads/2017/06/cool-fb-profile-pictures-Anonymous-facbook-profile-picture.jpg"));
        giveDatas.add(new GiveData("Mr John","Welcome","https://itechway.net/wp-content/uploads/2017/09/geek-boys-whatsapp-dp-1.jpg"));
        giveDatas.add(new GiveData("Mr Mike","Welcome","https://3.bp.blogspot.com/-CIwN5--ZO90/WkaapCwOcLI/AAAAAAAAG5Y/kFBnNj0DIa0w5E7plMe2Kgh5I2K9hCwLwCLcBGAs/s1600/Stylish-Attitude-Girl-Images-for-FB-Profile-Pic.jpg"));
        giveDatas.add(new GiveData("Mr Toney","Welcome","http://media.comicbook.com/2018/03/hot-toys-avengers-infinity-war-iron-man-1087986.jpeg"));

        // giveDatas.add(new GiveData("Mr Toney","Welcome"));
//        giveDatas.add(new GiveData("Mr John","Welcome"));
//        giveDatas.add(new GiveData("Mr Terry","Goodbye1"));
//        giveDatas.add(new GiveData("Mr Toney","Welcome"));
//        giveDatas.add(new GiveData("Mr John","Welcome"));
     return giveDatas;
    }
    }

