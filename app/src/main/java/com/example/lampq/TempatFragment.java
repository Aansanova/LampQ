package com.example.lampq;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Adapter.TempatAdapter;


public class TempatFragment extends Fragment {
    private RecyclerView recyclerView;
    private TempatAdapter adapter;
    private ArrayList<Tempat> tempatArrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tempat, container, false);


        addData();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        // 3. create an adapter
        TempatAdapter adapter = new TempatAdapter(this, tempatArrayList);


        // 4. set adapter
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        return view;
    }

    void addData(){
        tempatArrayList = new ArrayList<>();
        tempatArrayList.add(new Tempat("Rumah Sakit Airan", "Jl.Airan Raya 1", "0,08 km", R.drawable.ic_hospital));
        tempatArrayList.add(new Tempat("ATM BNI", "Jl.Ryacudu ,ITERA", "1 km",R.drawable.ic_atm));
        tempatArrayList.add(new Tempat("Kampus ITERA", "Jl.Ryacudu, Jati Agung", "1 km",R.drawable.ic_campus));
        tempatArrayList.add(new Tempat("Aham Siswana", "1214378098", "",R.drawable.ic_campus));
        tempatArrayList.add(new Tempat("Aham Siswana", "1214378098", "",R.drawable.ic_campus));
        tempatArrayList.add(new Tempat("Aham Siswana", "1214378098", "",R.drawable.ic_campus));
        tempatArrayList.add(new Tempat("Aham Siswana", "1214378098", "",R.drawable.ic_campus));
        tempatArrayList.add(new Tempat("Aham Siswana", "1214378098", "",R.drawable.ic_campus));
        tempatArrayList.add(new Tempat("Aham Siswana", "1214378098", "",R.drawable.ic_campus));
        tempatArrayList.add(new Tempat("asril", "1214378098", "",R.drawable.ic_campus));


    }
}