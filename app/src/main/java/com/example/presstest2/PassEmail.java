package com.example.presstest2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class PassEmail extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passemail);
        SysApplication.getInstance().addActivity(this);//為了儲存現在有多少activity

    }

    public void back(View view){
        FirebaseAuth.getInstance().signOut(); //log out
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }
    //Disable back button
    @Override
    public void onBackPressed(){
        moveTaskToBack(true);
    }
}
