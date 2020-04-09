package com.atilsamancioglu.uyarimesajlari

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast

        //applicationContext -> app context
        // this, this@MainActivity -> aktivitenin context

        Toast.makeText(this@MainActivity,"Hoşgeldiniz!",Toast.LENGTH_LONG).show()
    }


    fun kaydet(view: View){

        //Alert

        val uyari = AlertDialog.Builder(this@MainActivity)
        uyari.setTitle("Kaydet")
        uyari.setMessage("Kaydetmek İstediğinize Emin misiniz")
        //Lambda gösterimi
        uyari.setPositiveButton("Evet",DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(applicationContext,"Kayıt Edildi!",Toast.LENGTH_LONG).show()
        })

        uyari.setNegativeButton("Hayır") { dialogInterface: DialogInterface, i: Int ->
            Toast.makeText(applicationContext,"Kayıt Edilmedi!",Toast.LENGTH_LONG).show()
        }
        uyari.show()

    }
}