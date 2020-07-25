package com.example.digibizproproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class SubRecyclerAdapter extends RecyclerView.Adapter<SubRecyclerAdapter.ViewHolder> {
    private Context context;


    SubRecyclerAdapter(Context context){
        this.context=context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sub_categaries_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DirectoryActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView= itemView.findViewById(R.id.subdirectorytext);
            textView = itemView.findViewById(R.id.subrecyclerview);
            imageView = itemView.findViewById(R.id.subcategoryimage);
            imageView = itemView.findViewById(R.id.subfavimageview);
            cardView = itemView.findViewById(R.id.subcardview);

        }
    }
}