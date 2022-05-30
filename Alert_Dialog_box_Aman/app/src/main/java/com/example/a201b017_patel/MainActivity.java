package com.example.a201b017_patel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         new AlertDialog.Builder(this)
                 .setIcon(android.R.drawable.ic_dialog_alert)
                 .setTitle("Be Alert")
                 .setMessage("Welcome to the era of social Distancing")
                 .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(getApplicationContext(),"Welcome to the era of social distancing",Toast.LENGTH_SHORT).show();

                     }
                 })
                 .setNegativeButton("No", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                         Toast.makeText(getApplicationContext(),"Go back Corona",Toast.LENGTH_SHORT ).show();
                     }
                 })
                 .show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}