package com.shriom.lithodynamiclayout

import android.app.Application
import com.facebook.soloader.SoLoader

class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, false)
    }
}