package com.example.digibizproproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(recyclerAdapter);

        ConstraintLayout navigationView = findViewById(R.id.nav_drawer);
//        navigationView.setNavigationItemSelectedListener(this);
        drawerLayout = findViewById(R.id.layoutDrawer);
        toolbar = findViewById(R.id.toolbarrecycle);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        HeaderModel[] headerModels = {
                new HeaderModel(R.drawable.ic_baseline_home_24,"Home"),
                new HeaderModel(R.drawable.my_directory,"My Directory"),
                new HeaderModel(R.drawable.my_account,"My Account"),
                new HeaderModel(R.drawable.my_digibipro,"My Digibizpro"),
                new HeaderModel(R.drawable.my_event,"My events"),
                new HeaderModel(R.drawable.all_contact,"All Contacts"),
                new HeaderModel(R.drawable.all_contact,"Prices & Plans"),
                new HeaderModel(R.drawable.bulk_sms,"Bulk SMS/Email"),
                new HeaderModel(R.drawable.backup_resotre,"Backup & Restore"),
                new HeaderModel(R.drawable.setting,"Setting"),
                new HeaderModel(R.drawable.invite_friends,"Invite Friends"),
                new HeaderModel(R.drawable.rate_us,"Rate Us"),
                new HeaderModel(R.drawable.give_feedback,"Give Feedback"),
                new HeaderModel(R.drawable.about_us,"About us"),





        };
        RecyclerView recyclerView1 = findViewById(R.id.headerrecyclerview);
        HeaderRecyclerAdapter headerRecyclerAdapter = new HeaderRecyclerAdapter(this,headerModels);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView1.setAdapter(headerRecyclerAdapter);
        recyclerView1.setLayoutManager(linearLayoutManager);



    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        return true;
    }
}