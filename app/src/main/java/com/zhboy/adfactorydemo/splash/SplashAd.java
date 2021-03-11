package com.zhboy.adfactorydemo.splash;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import com.qq.e.ads.splash.SplashADListener;

/**
 * @author: zhou_hao
 * @date: 2021/3/11
 * @description:
 **/
public interface SplashAd {


    void loadGDTSplashAd(Activity activity, ViewGroup adContainer, View skipContainer,
                         String posId, int fetchDelay, SplashADListener listener);

    void destroy();
}
