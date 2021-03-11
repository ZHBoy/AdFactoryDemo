package com.zhboy.adfactorydemo.splash.gdt;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.qq.e.ads.splash.SplashAD;
import com.qq.e.ads.splash.SplashADListener;
import com.zhboy.adfactorydemo.splash.SplashAd;

/**
 * @author: zhou_hao
 * @date: 2021/3/11
 * @description: 广点通具体的开屏实现类
 **/
public class GdtSplashAd implements SplashAd {

    //模拟广点通开屏广告对象
    private SplashAD splashAD;

    @Override
    public void loadGDTSplashAd(Activity activity, ViewGroup adContainer, View skipContainer, String posId, int fetchDelay, SplashADListener listener) {
        splashAD = new SplashAD(activity, skipContainer, posId,listener, fetchDelay);
        splashAD.fetchAndShowIn(adContainer);
    }

    @Override
    public void destroy() {
        if (splashAD != null) {
            splashAD = null;
        }
    }

}
