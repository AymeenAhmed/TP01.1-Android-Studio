package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private  static final String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Question 1") ;
        Log.d(TAG, "le nom de la ressource chaîne qui spécifie le nom de l'application est app_name");

        Log.d(TAG,"Question 2") ;
        Log.d(TAG, "le nom du fichier de mise en page de l'activité principale est activity_main.xml");

        Log.d(TAG,"Question 3") ;
        Log.d(TAG, "l'outil pour créer un nouvel émulateur est AVD Manager");

        Log.d(TAG,"Question 4") ;
        Log.d(TAG," \"MainActivity layout is complete\" dans le volet Logcat si le menu de niveau Log est réglé sur 'Info'") ;


    }
}