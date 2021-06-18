package com.example.e_vet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;


public class Gidazehirlenmesi extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gidazehirlenmesi);

        pdfView = findViewById(R.id.pdfviewer);
        pdfView.fromAsset("gidazehirlenmesi.pdf")
                .defaultPage(0)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle( this))
                .spacing(2)
                .load();
    }
}