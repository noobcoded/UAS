package com.noobcoded.uas.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.noobcoded.uas.R;
import com.noobcoded.uas.ViewHolder;
import com.noobcoded.uas.model.ItemResultModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by noobcoded on 1/7/2019.
 */

public class MovieAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<ItemResultModel> list = new ArrayList<>();

    public MovieAdapter() {
    }

    public void clearAll() {
        list.clear();
        notifyDataSetChanged();
    }

    public void replaceAll(List<ItemResultModel> items) {
        list.clear();
        list = items;
        notifyDataSetChanged();
    }

    public void updateData(List<ItemResultModel> items) {
        list.addAll(items);
        notifyDataSetChanged();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.card_movie, parent, false
                )
        );
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
