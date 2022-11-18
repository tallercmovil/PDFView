package com.amaurypm.pdfview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
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
        //var uri = Uri.parse("geo:0,0?q=FI+UNAM")
        //startActivity(Intent(Intent.ACTION_VIEW,uri))

        //Un correo electrónico
        /*var intent = Intent(Intent.ACTION_SENDTO)
        var emails = arrayOf("amaury@comunidad.unam.mx")*/
        //intent.setType("*/*") //El MIME Type que va a tener nuestro correo. También puede ser "text/plain"
        /*intent.setData(Uri.parse("mailto:"))
        intent.putExtra(Intent.EXTRA_EMAIL, emails)
        intent.putExtra(Intent.EXTRA_SUBJECT, "Información sobre el producto X")
        intent.putExtra(Intent.EXTRA_TEXT, "Hola busco más información sobre el producto X.")

        if(intent.resolveActivity(packageManager)!=null) {
            startActivity(intent)
        }else{
            Toast.makeText(this, "No se encontró una aplicación que pueda procesar tu petición", Toast.LENGTH_SHORT).show()
        }*/

        //Settings o configuración de la app
        var intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) //abre los settings en una nueva activity
        var uri = Uri.fromParts("package", packageName, null)
        intent.setData(uri)
        startActivity(intent)


    }
}