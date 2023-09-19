package com.example.hairsalonbookingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BarAdapter extends RecyclerView.Adapter<BarAdapter.MyViewHolder> {

     Context context;
     ArrayList<Booking> mList;

    public BarAdapter(Context context, ArrayList<Booking> mList){
        this.mList = mList;
        this.context=context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Booking booking=mList.get(position);
        holder.date.setText(booking.date);
        holder.time.setText(booking.time);;
        holder.barber.setText(booking.barber);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView date, time, barber;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            date = itemView.findViewById(R.id.date_text);
            time = itemView.findViewById(R.id.time_text);
            barber = itemView.findViewById(R.id.barber_text);
        }
    }
}
