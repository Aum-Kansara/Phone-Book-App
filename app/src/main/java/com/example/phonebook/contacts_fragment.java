package com.example.phonebook;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class contacts_fragment extends Fragment {

    String s1[],s2[];
    int image[]={R.drawable.ic_baseline_phone_24,R.drawable.ic_baseline_phone_24,R.drawable.ic_baseline_phone_24,R.drawable.ic_baseline_phone_24,R.drawable.ic_baseline_phone_24,R.drawable.ic_baseline_phone_24,
            R.drawable.ic_baseline_phone_24,R.drawable.ic_baseline_phone_24,R.drawable.ic_baseline_phone_24,R.drawable.ic_baseline_phone_24};
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_contacts_fragment, container, false);
        s1=getResources().getStringArray(R.array.contactLists);
        recyclerView=view.findViewById(R.id.contacts_recyclerView);
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(getContext(),s1,image);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

}