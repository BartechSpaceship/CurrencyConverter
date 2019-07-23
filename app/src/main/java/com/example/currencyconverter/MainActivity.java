package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void converter(View view){


        EditText editTextConverter = (EditText) findViewById(R.id.editTextConverter);

        Double editTextDouble = Double.parseDouble(editTextConverter.getText().toString());

        Double yuanAmount = editTextDouble * 6.88;

        Toast.makeText(MainActivity.this, "$" + yuanAmount.toString(), Toast.LENGTH_SHORT).show();


        Log.i("amount", editTextConverter.getText().toString() );




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
