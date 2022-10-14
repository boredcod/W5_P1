package com.example.w6_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements TopFragment.OnDataPass{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onDataPass(String data) {
        Log.d("LOG","hello " + data);
        Bundle bundle = new Bundle();
        bundle.putString("animal", data);
        BottomFragment b = new BottomFragment();
        b.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.BottomFragment, b).commit();
    }
}