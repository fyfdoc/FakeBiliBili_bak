package com.bilibili.ui.live.viewbinder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bilibili.R;
import com.bilibili.model.bean.common.Partition;
import com.common.util.ImageUtil;
import com.common.util.SystemUtil;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by Android_ZzT on 17/6/26.
 */

public class PartitionItemViewBinder extends ItemViewBinder<Partition, PartitionItemViewBinder.PartitionViewHolder> {

    private Context context;

    public PartitionItemViewBinder(Context ctx) {
        context = ctx;
    }

    @NonNull
    @Override
    protected PartitionViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        View itemView = inflater.inflate(R.layout.item_live_partition, null);
        return new PartitionViewHolder(itemView);
    }

    @Override
    protected void onBindViewHolder(@NonNull PartitionViewHolder holder, @NonNull Partition item) {
        int width = Integer.valueOf(item.getSub_icon().getWidth());
        int height = Integer.valueOf(item.getSub_icon().getHeight());
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(width, height);
        params.addRule(RelativeLayout.CENTER_VERTICAL);
        params.rightMargin = SystemUtil.dp2px(context, 4);
        holder.ivIcon.setLayoutParams(params);
        int iconWidth = context.getResources().getDimensionPixelSize(R.dimen.width_24dp);
        int iconHeight = context.getResources().getDimensionPixelSize(R.dimen.height_24dp);
        ImageUtil.load(holder.ivIcon, item.getSub_icon().getSrc(), iconWidth, iconHeight);
        if (TextUtils.isEmpty(item.getName()) && item.getName().equals("推荐主播")) {
            String tintCount = "<font color='#FF4081'>" + item.getCount() + "</font>";
            String count = String.format(context.getString(R.string.partition_count_format), tintCount);
            holder.tvCount.setText(Html.fromHtml(count));
        } else {
            holder.tvCount.setText(context.getString(R.string.live_more));
        }
        holder.tvName.setText(item.getName());
    }

    static class PartitionViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.iv_icon)
        SimpleDraweeView ivIcon;
        @BindView(R.id.tv_count)
        TextView tvCount;

        public PartitionViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
