package com.example.laba4;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.laba4.FirstFragment;
import com.example.laba4.GenericFragment;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void b1Click(View view) {
        FirstFragment firstFragment = new FirstFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.host, firstFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void b2Click(View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
// Второй
// полупрозрачный красный
        transaction.replace(R.id.host,
                GenericFragment.newInstance(0x99FF0000, "Second")
        );
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void b3Click(View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
// Третий
// полупрозрачный зеленый
        transaction.replace(R.id.host,
                GenericFragment.newInstance(0x9900FF00, "Третий")
        );
        transaction.addToBackStack(null);
        transaction.commit();
    }
}