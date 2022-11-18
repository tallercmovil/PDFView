package com.amaurypm.pdfview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amaurypm.pdfview.databinding.ActivityPdfactivityBinding

class PDFActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPdfactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        when{
            intent?.action == Intent.ACTION_VIEW -> {
                if(intent.type=="application/pdf"){
                    var data = intent.data
                    binding.pdfView.fromUri(data).load()
                }

            }
        }
    }
}