package com.meembusoft.recyclerview.sample.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.meembusoft.recyclerview.adapter.RecyclerArrayAdapter;
import com.meembusoft.recyclerview.sample.viewholder.MViewHolder;
import com.meembusoft.recyclerview.viewholder.BaseViewHolder;

import java.security.InvalidParameterException;

public class MAdapter extends RecyclerArrayAdapter<String> {

    private static final int VIEW_TYPE_REGULAR = 1;

    public MAdapter(Context context) {
        super(context);
    }

    @Override
    public int getViewType(int position) {
        return VIEW_TYPE_REGULAR;
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case VIEW_TYPE_REGULAR:
                return new MViewHolder(parent);
            default:
                throw new InvalidParameterException();
        }
    }
}