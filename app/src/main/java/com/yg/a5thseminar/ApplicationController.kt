package com.yg.a5thseminar

import android.app.Application
import android.content.Context
import android.widget.Toast
import com.tsengvn.typekit.Typekit

/**
 * Created by 2yg on 2017. 11. 15..
 */
class ApplicationController : Application(){
    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        Typekit.getInstance()
                .addNormal(Typekit.createFromAsset(this, "NanumGothic.otf"))
                .addBold(Typekit.createFromAsset(this, "NanumGothicBold.otf"))
                .addCustom1(Typekit.createFromAsset(this, "NanumGothicExtraBold.otf"))
        instance = this

    }


    fun makeToast(message: String) {
        Toast.makeText(appContext, message, Toast.LENGTH_SHORT).show()
    }
//
    companion object {
        val baseUrl = "http://52.79.136.159:3000/"
        var appContext: Context? = null
        var instance: ApplicationController? = null
            private set
    }
}