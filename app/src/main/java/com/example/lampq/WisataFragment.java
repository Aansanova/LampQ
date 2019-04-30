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


import Adapter.WisataAdapter;


public class WisataFragment extends Fragment {

    private RecyclerView recyclerView;
    private WisataAdapter adapter;
    private ArrayList<Wisata> wisataArrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wisata, container, false);


        addData();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        // 3. create an adapter
        WisataAdapter adapter1 = new WisataAdapter(this, wisataArrayList);


        // 4. set adapter
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter1);

        return view;
    }

    void addData(){
        wisataArrayList = new ArrayList<>();
        wisataArrayList.add(new Wisata("Menara Siger", "Bakauheni , Lampung Selatan", "3 km", R.drawable.menara));
        wisataArrayList.add(new Wisata("Pantai Mutun", "Kab.Lampung", "7 km",R.drawable.pantai_mutun));
        wisataArrayList.add(new Wisata("Pantai Sari Ringgung", "Kab.Lampung", "8 km",R.drawable.sari_ringgung));



    }
}