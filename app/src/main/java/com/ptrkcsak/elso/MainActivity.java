package com.ptrkcsak.elso;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button buttonKuldes;
    private EditText editTextBemenet;
    private TextView textViewKimenet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void init() {
        buttonKuldes = findViewById(R.id.buttonKuldes);
        editTextBemenet = findViewById(R.id.editTextBemenet);
        textViewKimenet = findViewById(R.id.textViewKimenet);
    }
}