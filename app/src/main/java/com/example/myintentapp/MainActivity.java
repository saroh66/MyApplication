package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        val btnSatu:Button = findViewById(R.id.btn_1)
        btnSatu.setOnclickListener(this)

    }

    override fun

    Onclick(v:View)

    TODO(reason:"Not yet implemented")
}

}