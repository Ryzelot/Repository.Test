package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText);
        String nombre = editText1.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Nombre", nombre);
        startActivity(intent);
    }
}