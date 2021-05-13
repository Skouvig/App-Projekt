package com.example.projekt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=findViewById(R.id.drawer);
        navigationView=findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout, toolbar,R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();


        // load default fragments
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container_fragment,new MainFragment());
        fragmentTransaction.commit();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if(menuItem.getItemId() == R.id.home){

        }

        if(menuItem.getItemId() == R.id.shop){

        }

        if(menuItem.getItemId() == R.id.progress){

        }

        if(menuItem.getItemId() == R.id.profile){

        }

        if(menuItem.getItemId() == R.id.settings){

        }
        return true;
    }
}