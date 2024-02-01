package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onLeftClick(view: View) {
        val myToast = Toast.makeText(getApplicationContext(), "Мартышка молчит", Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.TOP, 0, 0);
        myToast.show();
    }

    fun onCenterClick(view: View) {
        val myToast = Toast.makeText(getApplicationContext(), "Мартышка не видит", Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.TOP, 0, 0);
        myToast.show();
    }

    fun onRightClick(view: View) {
        val myToast = Toast.makeText(getApplicationContext(), "Мартышка не слышит", Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.TOP, 0, 0);
        myToast.show();
    }
}