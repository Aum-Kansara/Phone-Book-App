package com.example.phonebook;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class phone_fragment extends Fragment {
    String name[],number[],time[];
    RecyclerView recyclerView1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_phone_fragment, container, false);
        name=getResources().getStringArray(R.array.contactLists);
        number=getResources().getStringArray(R.array.numberList);
        time=getResources().getStringArray(R.array.timeList);
        recyclerView1=view.findViewById(R.id.phone_recyclerView);
        phoneAdapter phoneAdapter=new phoneAdapter(getContext(),name,number,time);
        recyclerView1.setAdapter(phoneAdapter);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}