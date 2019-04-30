package com.example.navigationbar.second_nav.activity;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.navigationbar.R;

public class SecondNavigationActivity extends AppCompatActivity {

    private DrawerLayout mDraweLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_navigation);

        mDraweLayout = findViewById(R.id.sec_drawer_lay);
        mToggle = new ActionBarDrawerToggle(this, mDraweLayout,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        mDraweLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
