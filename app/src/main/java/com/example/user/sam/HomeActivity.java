package com.example.user.sam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import layout.Slider;
import layout.homeBottom;


/**
 * Created by Avinash on 2/14/2017.
 */

public class HomeActivity  extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, homeBottom.OnFragmentInteractionListener, Slider.OnFragmentInteractionListener{

    ImageButton nav_button;
    DrawerLayout mDrawerLayout;
    NavigationView navigationView;

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PlayGifView pGif = (PlayGifView) findViewById(R.id.viewGif);
        //pGif.setImageResource(R.drawable.rrr2);

        nav_button = (ImageButton) findViewById(R.id.nav_button);
        nav_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intentLoadNewActivity = new Intent(MainActivity.this,Main2Activity.class);
                //startActivity(intentLoadNewActivity);
                mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
                mDrawerLayout.openDrawer(Gravity.LEFT);
            }

        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}