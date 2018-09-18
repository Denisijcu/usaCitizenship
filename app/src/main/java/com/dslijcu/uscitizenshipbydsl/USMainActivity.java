package com.dslijcu.uscitizenshipbydsl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class USMainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usmain);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent infor = new Intent(USMainActivity.this,wpageInformation.class);
                startActivity(infor);

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.usmain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent iAutor = new Intent(this,Creditos.class);
            startActivity(iAutor);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
      switch (id) {
         case R.id.part1:
               Intent mP = new Intent(this,PartOne.class);
               startActivity(mP);
            // Toast.makeText(this,"Esta es la primera opcion",Toast.LENGTH_LONG).show();
              break;
          case R.id.part2:
              Intent mP2 = new Intent(this,PartTwo.class);
              startActivity(mP2);
              break;
          case R.id.part3:
              Intent mP3 = new Intent(this,ParteC.class);
              startActivity(mP3);
              break;
          case R.id.part4:
              Intent mP4 = new Intent(this,parteD.class);
              startActivity(mP4);
              break;
          case R.id.part5:
              Intent mP5 = new Intent(this,PartE.class);
              startActivity(mP5);
              break;

          case R.id.part6:
              Intent mP6 = new Intent(this,part_f.class);
              startActivity(mP6);
              break;
          case R.id.part7:
              Intent mP7 = new Intent(this,part_g.class);
              startActivity(mP7);
              break;
          case R.id.part8:
              Intent mP8 = new Intent(this,part_h.class);
              startActivity(mP8);
              break;
          case R.id.part9:
              Intent mP9 = new Intent(this,part_i.class);
              startActivity(mP9);
              break;

          case R.id.part10:
              Intent mP10 = new Intent(this,inglishtest.class);
              startActivity(mP10);
              break;
      }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
