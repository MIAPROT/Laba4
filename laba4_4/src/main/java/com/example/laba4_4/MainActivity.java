package com.example.laba4_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.laba4.GenericFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void b1Click(View view) {
        RegistrationFragment registrationFragment = new RegistrationFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.host, registrationFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void b2Click(View view) {
        LoginFragment loginFragment = new LoginFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.host, loginFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}