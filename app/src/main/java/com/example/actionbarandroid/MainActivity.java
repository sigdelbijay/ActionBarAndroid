package com.example.actionbarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar theToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(theToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_setting) {
            DialogFragment myFragment = new MyDialogFragment();
            myFragment.show(getSupportFragmentManager(), "theDialog");
            return true;
        } else if (id==R.id.exit_the_app){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
