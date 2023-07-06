package com.example.phonebook;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class phoneAdapter extends RecyclerView.Adapter<phoneAdapter.phoneViewHolder>{
    Context context;
    String name[],number[],time[];
    static int PERMISSION_CODE=100;
    public phoneAdapter(Context ct, String n[], String num[], String t[]){
        context=ct;
        name=n;
        number=num;
        time=t;
    }
    @NonNull
    @Override
    public phoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.phone_layout,parent,false);
        return new phoneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull phoneViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.name_txt.setText(name[position]);
        holder.number_txt.setText("+91 "+number[position]);
        holder.time_txt.setText(time[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+number[position]));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class phoneViewHolder extends RecyclerView.ViewHolder {
        TextView name_txt,number_txt,time_txt;
        public phoneViewHolder(@NonNull View itemView) {
            super(itemView);
            name_txt=itemView.findViewById(R.id.phone_nameTxt);
            number_txt=itemView.findViewById(R.id.phone_numberTxt);
            time_txt=itemView.findViewById(R.id.phone_timeTxt);

        }
    }
}
