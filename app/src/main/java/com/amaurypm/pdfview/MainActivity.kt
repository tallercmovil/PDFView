package com.amaurypm.pdfview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        //Toast.makeText(this, "Intent", Toast.LENGTH_LONG).show()

        //Para un url
        //var uri = Uri.parse("https://www.marca.com")
        //startActivity(Intent(Intent.ACTION_VIEW,uri))

        //Para un click to call
        //var uri = Uri.parse("tel:5556581111")
        //startActivity(Intent(Intent.ACTION_DIAL, uri))

        //Una localización
        var uri = Uri.parse("geo:0,0?q=FI+UNAM")
        startActivity(Intent(Intent.ACTION_VIEW,uri))

    }
}