package com.example.nyusukuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val switchMaterial = findViewById<SwitchMaterial>(R.id.switch1)
        switchMaterial.setOnCheckedChangeListener { buttonView, b ->
            if (b)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            else
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }

        btnIntent = findViewById(R.id.button)
        btnIntent.setOnClickListener(this)

        val Name = findViewById<EditText>(R.id.Username)
        val Simpan = findViewById<Button>(R.id.simpan)
        val dispMessage = findViewById<TextView>(R.id.textViewUsername)

        Simpan.setOnClickListener {
            dispMessage.setText(" Register Sukses, Terima Kasih" + Name.text+ "!" )
        }
    }


    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.button -> run {
                    val intentBiasa = Intent(this@MainActivity, Home::class.java)
                    startActivity(intentBiasa)
                }
            }
        }
    }
}