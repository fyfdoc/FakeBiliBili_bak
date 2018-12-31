package com.bilibili.ui.recommed;

import com.common.base.BasePresenter;
import com.common.base.BaseView;

import me.drakeet.multitype.Items;

/**
 * Created by miserydx on 17/7/6.
 */

public interface RecommendContract {

    interface View extends BaseView {

        void onDataUpdated(Items items, int state);

        void onRefreshingStateChanged(boolean isRefresh);

        void showLoadFailed();

    }

    interface Presenter extends BasePresenter {

        void pullToRefresh(int idx);

        void loadMore(int idx);

    }

}