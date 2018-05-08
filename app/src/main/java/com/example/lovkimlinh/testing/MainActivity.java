package com.example.lovkimlinh.testing;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolb);

         Toolbar toolbar = findViewById(R.id.tool);
         setSupportActionBar(toolbar);
         getSupportActionBar().setTitle("Year 3");

         drawerLayout = findViewById(R.id.b1);
         ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
         drawerLayout.addDrawerListener(actionBarDrawerToggle);
         actionBarDrawerToggle.syncState();



        NavigationView navigationView = findViewById(R.id.navi);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


               if (item.getItemId() == R.id.event_icon) {
                    getSupportActionBar().setTitle("Event");
                    Event_Onclick();
                    Toast.makeText(MainActivity.this, "Event has been click", Toast.LENGTH_LONG).show();
                }
                else if (item.getItemId() == R.id.new_icon) {
                      getSupportActionBar().setTitle("New");
                       New_Onclick();
                    Toast.makeText(MainActivity.this, "New has been click", Toast.LENGTH_LONG).show();
                }
                else if (item.getItemId()==R.id.home_icon){
                    getSupportActionBar().setTitle("Home");
                    Home_Onclick();
                    Toast.makeText(MainActivity.this, "Gallary has been click", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }

    private void Event_Onclick() {

        drawerLayout.closeDrawers();
        EventClick eventClick = new EventClick();
        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.free,eventClick);
        fragmentTransaction.commit();
    }

    private void New_Onclick(){
        drawerLayout.closeDrawers();
        NewClick newClick = new NewClick();
        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.free,newClick);
        fragmentTransaction.commit();
    }

    private void Home_Onclick(){
        drawerLayout.closeDrawers();
        FragmentHome fragmentHome = new FragmentHome();
        android.app.FragmentManager fragmentManager= getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.free,fragmentHome);
        fragmentTransaction.commit();
    }
}






