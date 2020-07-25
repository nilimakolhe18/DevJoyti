package com.example.digibizproproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DirectoryAdapter extends RecyclerView.Adapter<DirectoryAdapter.ViewHolder> {
    private Context context;


    DirectoryAdapter (Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.directory_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.directorytext);
            textView = itemView.findViewById(R.id.indiantext);
            textView = itemView.findViewById(R.id.shillongtext);
            imageView = itemView.findViewById(R.id.directoryfavimageview);
            imageView = itemView.findViewById(R.id.directoryimageview);
            imageView = itemView.findViewById(R.id.shareimageview);
            imageView = itemView.findViewById(R.id.whatsappimageview);
            imageView = itemView.findViewById(R.id.locationimageview);
            imageView = itemView.findViewById(R.id.messageimageview);
            imageView = itemView.findViewById(R.id.emailimageview);
            imageView = itemView.findViewById(R.id.callimageview);

        }
    }
}
