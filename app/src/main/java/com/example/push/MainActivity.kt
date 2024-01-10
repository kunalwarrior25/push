package com.example.push

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tr:EditText
    lateinit var r:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tr= findViewById(R.id.edittext)
        r = findViewById(R.id.button)

        r.setOnClickListener(){
            var t = tr.text.toString()
            Toast.makeText(this,"hello $t",Toast.LENGTH_LONG).show()
        }
    }
}