package com.omersungur.fragmentexample2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun changeActivity (view : View) {
        var intent = Intent(this@MainActivity,MainActivity2::class.java)

        startActivityForResult(intent, 0) // Aktiviteye geri dönüldüğünde kullanılacak.
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        //requestCode ile birden fazla aktivitiden buraya dönüyorsak hangisinden döndüğümüzü bulmak için kullanabiliriz.
        // resultCode ile işlem başarılı mı değil mi kontrol edebiliriz.
        super.onActivityResult(requestCode, resultCode, data)

        //Toast.makeText(this@MainActivity,"Geri Dönen Değer",Toast.LENGTH_LONG).show()

        if (requestCode == 0 && resultCode == Activity.RESULT_OK) {
            var str = data?.getStringExtra("geriDeger") // Bu aktivitiye geri dönerken alacağımız değer.
            Toast.makeText(this@MainActivity,str,Toast.LENGTH_LONG).show()

        }

    }
}