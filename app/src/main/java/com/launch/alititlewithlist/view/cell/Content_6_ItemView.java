package com.launch.alititlewithlist.view.cell;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.launch.alititlewithlist.R;
import com.launch.alititlewithlist.adapter.ItemViewFactory;
import com.launch.alititlewithlist.model.IndexContentModel;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 首页广告类型7
 * 用到的数据 Title、Image、ImageLink
 * Created by Junnan on 2018/3/14.
 */

public class Content_6_ItemView extends ItemViewFactory<IndexContentModel, Content_6_ItemView.Content_6_ViewHolder> {

    public Content_6_ItemView(Context context, IndexContentModel data) {
        super(context, data);
    }

    @Override
    public Content_6_ViewHolder onCreateViewHolder(Context context, ViewGroup parent) {
        return new Content_6_ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_index_ad_contentl6, parent, false));
    }

    @Override
    public void onBindViewHolder(Context context, Content_6_ViewHolder holder, IndexContentModel data) {
        if (data != null){
            //显示数据
        }
    }


    static class Content_6_ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvTitle)
        TextView tvTitle;
        @BindView(R.id.image1)
        ImageView image1;
        @BindView(R.id.image2)
        ImageView image2;

        Content_6_ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
