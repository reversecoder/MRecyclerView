package com.meembusoft.recyclerview.sample.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;

import com.meembusoft.recyclerview.sample.R;
import com.meembusoft.recyclerview.viewholder.BaseViewHolder;

/**
 * @author Md. Rashadul Alam
 * Email: rashed.droid@gmail.com
 */
public class MViewHolder extends BaseViewHolder<String> {

    private TextView tviItemName, tvItemDescription;

    public MViewHolder(ViewGroup parent) {
        super(parent, R.layout.row_item);

        tviItemName = $(R.id.tv_item_name);
        tvItemDescription = $(R.id.tv_item_description);
    }

    @Override
    public void setData(final String data) {
        tviItemName.setText(data);
    }
}