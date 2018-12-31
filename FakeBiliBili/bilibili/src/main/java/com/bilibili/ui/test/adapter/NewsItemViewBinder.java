package com.bilibili.ui.test.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bilibili.R;
import com.bilibili.model.bean.WeiXinJingXuanBean;
import com.common.util.ImageUtil;
import com.common.util.SystemUtil;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by Android_ZzT on 17/5/24.
 */

public class NewsItemViewBinder extends ItemViewBinder<WeiXinJingXuanBean.NewsList, NewsItemViewBinder.NewsItemViewHolder> {

    private Context mContext;

    public NewsItemViewBinder(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    protected NewsItemViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View itemView = inflater.inflate(R.layout.item_wechat_jingxuan, null);
        return new NewsItemViewHolder(itemView);
    }

    @Override
    protected void onBindViewHolder(@NonNull NewsItemViewHolder holder, @NonNull WeiXinJingXuanBean.NewsList item) {
        Context context = holder.ivCover.getContext();
        int width = SystemUtil.dp2px(context, 60);
        int height = SystemUtil.dp2px(context, 60);
        ImageUtil.load(holder.ivCover, item.getPicUrl(), width, height);
        holder.tvTitle.setText(item.getTitle());
        holder.tvDescription.setText(item.getDescription());
    }

    static class NewsItemViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.cover_iv)
        SimpleDraweeView ivCover;
        @BindView(R.id.title_tv)
        TextView tvTitle;
        @BindView(R.id.description_tv)
        TextView tvDescription;

        public NewsItemViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
