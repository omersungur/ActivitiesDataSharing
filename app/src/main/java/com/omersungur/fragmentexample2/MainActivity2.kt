package com.omersungur.fragmentexample2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun backPr(view : View) { // yeni bir intent oluşturmuyoruz çünkü eski activitye geri döneceğiz.

        var i = Intent()
        i.putExtra("geriDeger","Geri gönderilen Değer")
        setResult(Activity.RESULT_OK,i)
        finish()
    }
}