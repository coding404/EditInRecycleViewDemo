package com.example.liushu.editinrecycleviewdemo;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

public class SuperViewHolder extends RecyclerView.ViewHolder {

    private SparseArray<View> views;
    //结合butterknife使用
    private View mRootView;

    public SuperViewHolder(View itemView) {
        super(itemView);
        mRootView = itemView;
        this.views = new SparseArray<>();
    }

    public View getRootView() {
        return mRootView;
    }

    @SuppressWarnings("unchecked")
    public <T extends View> T getView(int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            view = itemView.findViewById(viewId);
            views.put(viewId, view);
        }
        return (T) view;
    }
}
