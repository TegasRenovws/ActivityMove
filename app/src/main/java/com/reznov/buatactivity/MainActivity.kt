package com.reznov.buatactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtWidth:EditText
    private lateinit var edtLength:EditText
    private lateinit var edtHeight:EditText
    private lateinit var btnItung:Button
    private lateinit var tvHasil:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtWidth = findViewById(R.id.edt_width)
        edtLength = findViewById(R.id.edt_length)
        edtHeight = findViewById(R.id.edt_height)
        btnItung = findViewById(R.id.btn_itung)
        tvHasil = findViewById(R.id.tv_hasil)

        btnItung.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_itung){
            val inputLength = edtLength.text.toString().trim()
            val inputWidth =  edtWidth.text.toString().trim()
            val inputHeight = edtHeight.text.toString().trim()

            val volume = inputLength.toDouble()*inputWidth.toDouble()*inputHeight.toDouble()
            tvHasil.text = volume.toString()
        }
    }
}