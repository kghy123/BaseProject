package com.google.kghy1234.baseproject.base;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BaseViewHolder extends RecyclerView.ViewHolder{

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public View getViewById(int viewId){
        return itemView.findViewById(viewId);
    }

}
