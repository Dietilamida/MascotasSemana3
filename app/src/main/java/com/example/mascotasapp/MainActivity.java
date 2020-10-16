package com.example.mascotasapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.mascotasapp.adapter.PageAdapter;
import com.example.mascotasapp.fragments.FragmentPerfil;
import com.example.mascotasapp.fragments.FragmentRecyclerView;
import com.example.mascotasapp.pojo.Mascota;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuppal,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.action_favoritos){

            Intent intent=new Intent(this,FavoritosActivity.class);
            startActivity(intent);

            return true;
        }

        if(item.getItemId()==R.id.action_acerca) {

            Intent intent = new Intent(this, AcercaActivity.class);
            startActivity(intent);

            return true;
        }

        if(item.getItemId()==R.id.action_contacto) {

            Intent intent = new Intent(this, ContactoActivity.class);
            startActivity(intent);

            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.pet);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager =findViewById(R.id.viewpager);
        setUpViewPager();

        if (toolbar != null){
            setSupportActionBar(toolbar);
        }




    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new FragmentRecyclerView());
        fragments.add(new FragmentPerfil());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_perro);


    }





}
