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

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private Context context;

    RecyclerAdapter(Context context) {
        this.context = context;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.categaries_item_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,SubCategoryActivity.class);
                context.startActivity(intent);
            }
        });
//        holder.textView.setText(position);
//        holder.imageView.setImageResource(position);

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
            textView = itemView.findViewById(R.id.directorytext);
            textView = itemView.findViewById(R.id.categoriestext);
            imageView = itemView.findViewById(R.id.favouiteimage);
            imageView = itemView.findViewById(R.id.logoimageview);
            imageView = itemView.findViewById(R.id.backslashimage);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }

}
