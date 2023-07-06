package com.example.phonebook;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    String data1[];
    int images[];
    Context context;
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.nameTxt);
            image=itemView.findViewById(R.id.contactImage);
        }

    }
    public RecyclerAdapter(Context ct, String s1[],int imgs[]){
        context=ct;
        data1=s1;
        images=imgs;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.contact_view,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.name.setText(data1[position]);
            holder.image.setImageResource(images[position]);

            //holder.itemView.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(),R.anim.recycler_anim));
    }

    @Override
    public int getItemCount() {return images.length;}

}