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
interface SplashAdFactory {

    SplashAd getSplashAd();
}
