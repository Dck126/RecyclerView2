package com.example.recyclerviewv2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RvMainAdapter extends RecyclerView.Adapter<RvMainAdapter.ViewHolder> {
    private List<RvMainModel> models;
    private OnItemClickListener<RvMainModel> clickListener;

    public RvMainAdapter(List<RvMainModel> models) {
        this.models = models;
    }

    public void setClickListener(OnItemClickListener<RvMainModel> clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_main_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(models.get(position));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        RvMainModel makanan;
        TextView titles;
        ImageView images;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            titles = itemView.findViewById(R.id.tv_main_title);
            images = itemView.findViewById(R.id.iv_main_photo);
        }

        public void onBind(RvMainModel makanan) {
            this.makanan = makanan;
            images.setBackgroundResource(makanan.getPhoto());
            titles.setText(makanan.getTitle());
        }

        @Override
        public void onClick(View v) {
            clickListener.onClick(makanan);
        }
    }

}
