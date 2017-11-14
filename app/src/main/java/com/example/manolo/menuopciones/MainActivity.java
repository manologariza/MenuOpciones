package com.example.manolo.menuopciones;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent i;
        switch (item.getItemId()){
            case R.id.itemCurso:
                i=new Intent("android.intent.action.VIEW", Uri.parse("http://developer.android.com"));
                startActivity(i);
                break;
            case R.id.itemPrensa:
                i=new Intent("android.intent.action.VIEW", Uri.parse("http://www.marca.es"));
                startActivity(i);
                break;
        }
        return true;
    }
}
