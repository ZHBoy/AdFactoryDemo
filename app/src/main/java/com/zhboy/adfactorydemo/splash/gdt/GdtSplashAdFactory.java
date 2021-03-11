package com.zhboy.adfactorydemo.splash.gdt;

import com.zhboy.adfactorydemo.splash.SplashAd;
import com.zhboy.adfactorydemo.splash.SplashAdFactory;

/**
 * @author: zhou_hao
 * @date: 2021/3/11
 * @description:
 **/
public class GdtSplashAdFactory implements SplashAdFactory {
    @Override
    public SplashAd getSplashAd() {
        return new GdtSplashAd();
    }
}
