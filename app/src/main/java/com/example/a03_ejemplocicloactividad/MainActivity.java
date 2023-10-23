package com.example.a03_ejemplocicloactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("ESTADOS", "1- Estoy en el método Create");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "6- Estoy en el método Destroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3- Estoy en el método Resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "5- Estoy en el método Stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4- Estoy en el método Pause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2- Estoy en el método Start");
    }
}