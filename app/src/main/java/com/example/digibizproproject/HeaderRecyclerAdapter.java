package com.example.digibizproproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HeaderRecyclerAdapter extends RecyclerView.Adapter<HeaderRecyclerAdapter.ViewHolder> {
    private Context context;
    private HeaderModel[] headerModel;

    HeaderRecyclerAdapter (Context context,HeaderModel[] headerModel){
        this.context = context;
        this.headerModel = headerModel;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.header_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(headerModel[position].getText());
        holder.imageView.setImageResource(headerModel[position].getImage());




    }

    @Override
    public int getItemCount() {
        return headerModel.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.hometext);
            imageView = itemView.findViewById(R.id.homeimageview);
        }
    }

}
