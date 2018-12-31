package com.bilibili.di.component;

import com.bilibili.di.module.ActivityModule;
import com.bilibili.di.module.PageModule;
import com.bilibili.di.scope.PerActivity;
import com.bilibili.ui.live.liveplay.LivePlayActivity;
import com.bilibili.ui.main.MainActivity;
import com.bilibili.ui.test.activity.NewsActivity;
import com.bilibili.ui.test.activity.ScrollGradientActivity;
import com.bilibili.ui.test.activity.StatusWithPictureActivity;
import com.bilibili.ui.test.activity.TestApiActivity;
import com.bilibili.ui.test.activity.TestNoBaseActivity;
import com.bilibili.ui.test.activity.TestNoBaseMvpActivity;
import com.bilibili.ui.test.activity.ToolbarBehaviorActivity;

import dagger.Component;

/**
 * Created by jiayiyang on 17/3/23.
 */

@Component(dependencies = {ApiComponent.class}, modules = {ActivityModule.class, PageModule.class})
@PerActivity
public interface ActivityComponent {
    //Bilibili
    void inject(MainActivity mainActivity);
    void inject(LivePlayActivity livePlayActivity);

    //Test
    void inject(NewsActivity newsActivity);
    void inject(ToolbarBehaviorActivity toolbarBehaviorActivity);
    void inject(StatusWithPictureActivity statusWithPictureActivity);
    void inject(ScrollGradientActivity scrollGradientActivity);
    void inject(TestApiActivity testApiActivity);
    void inject(TestNoBaseActivity testNoBaseActivity);
    void inject(TestNoBaseMvpActivity testNoBaseMvpActivity);


}
