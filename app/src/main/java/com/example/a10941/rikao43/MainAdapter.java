package com.example.a10941.rikao43;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder>{
    List<String> list=new ArrayList<>();
    public void rh(List<String> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainAdapter.MainHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.mainview, viewGroup, false);
        return new MainHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder mainHolder, int i) {
        mainHolder.tex.setText(list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class MainHolder extends RecyclerView.ViewHolder {
        TextView tex;
        public MainHolder(@NonNull View itemView) {
            super(itemView);
            tex=itemView.findViewById(R.id.tex);
        }
    }
}
