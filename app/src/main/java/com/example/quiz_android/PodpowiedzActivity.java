package com.example.quiz_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PodpowiedzActivity extends AppCompatActivity {
    Button wroc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podpowiedz);
        wroc = findViewById(R.id.button3);
        wroc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent rewind = new Intent(PodpowiedzActivity.this,MainActivity.class);
                        startActivity(rewind);
                    }
                }
        );
    }

}