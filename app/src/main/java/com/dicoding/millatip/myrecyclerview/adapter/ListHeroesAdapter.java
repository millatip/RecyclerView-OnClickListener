package com.dicoding.millatip.myrecyclerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.millatip.myrecyclerview.R;
import com.dicoding.millatip.myrecyclerview.model.Heroes;

import java.util.ArrayList;

public class ListHeroesAdapter extends RecyclerView.Adapter<ListHeroesAdapter.CategoryViewHolder> {

    private Context context;

    private ArrayList<Heroes> getListHeroes() {
        return listHeroes;
    }

    public void setListHeroes(ArrayList<Heroes> listHeroes) {
        this.listHeroes = listHeroes;
    }

    private ArrayList<Heroes> listHeroes;

    private OnHeroListener mOnHeroListener;


    public ListHeroesAdapter(Context context, OnHeroListener onHeroListener) {
        this.mOnHeroListener = onHeroListener;
        this.context = context;
    }
    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_heroes, parent, false);
        return new CategoryViewHolder(itemRow, mOnHeroListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.tvName.setText(getListHeroes().get(position).getName());
        holder.tvRemarks.setText(getListHeroes().get(position).getRemarks());

        Glide.with(context)
                .load(getListHeroes().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListHeroes().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;
        OnHeroListener onHeroListener;

        CategoryViewHolder(View itemView, OnHeroListener onHeroListener) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            this.onHeroListener = onHeroListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onHeroListener.onItemClick(getAdapterPosition());
        }
    }

    public interface OnHeroListener{
        void onItemClick(int position);
    }
}
