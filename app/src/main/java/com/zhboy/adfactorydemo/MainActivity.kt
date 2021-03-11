package com.zhboy.adfactorydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView
import com.qq.e.ads.splash.SplashADListener
import com.qq.e.comm.util.AdError
import com.zhboy.adfactorydemo.splash.gdt.GdtSplashAdFactory
import com.zhboy.adfactorydemo.splash.SplashAd

public class MainActivity : AppCompatActivity() {

    //广点通开屏
    private var gdtSplashAdFactory: GdtSplashAdFactory? = null
    private var gdtSplashAd: SplashAd? = null

    private var flAd: FrameLayout? = null
    private var tvSkip: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        flAd = findViewById(R.id.flAd)
        tvSkip = findViewById(R.id.tvSkip)

        loadGdtSplashAd()

    }

    /**
     * 加载开屏广告
     */
    private fun loadGdtSplashAd(){
        gdtSplashAdFactory =
            GdtSplashAdFactory()
        gdtSplashAd = gdtSplashAdFactory?.splashAd
        gdtSplashAd?.loadGDTSplashAd(this, flAd, tvSkip, "102112", 0, object : SplashADListener {
            override fun onADExposure() {
            }

            override fun onADDismissed() {
            }

            override fun onADPresent() {
            }

            override fun onADLoaded(p0: Long) {
            }

            override fun onNoAD(p0: AdError?) {
            }

            override fun onADClicked() {
            }

            override fun onADTick(p0: Long) {
            }

        })
    }

    override fun onDestroy() {
        super.onDestroy()
        gdtSplashAd?.destroy()//销毁具体的开屏
    }
}