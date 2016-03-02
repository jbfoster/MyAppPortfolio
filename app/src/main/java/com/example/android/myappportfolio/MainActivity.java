package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void spotifyToast (View view) {
        Toast.makeText(this, getString(R.string.spotify_toast_text), Toast.LENGTH_SHORT).show();
        }

    public void scoresToast (View view) {
        Toast.makeText(this, getString(R.string.scores_toast_text), Toast.LENGTH_SHORT).show();
    }

    public void libraryToast (View view) {
        Toast.makeText(this, getString(R.string.library_toast_text), Toast.LENGTH_SHORT).show();
    }

    public void buildToast (View view) {
        Toast.makeText(this, getString(R.string.build_toast_text), Toast.LENGTH_SHORT).show();
    }

    public void xyzToast (View view) {
        Toast.makeText(this, getString(R.string.xyz_toast_text), Toast.LENGTH_SHORT).show();
    }

    public void capstoneToast (View view) {
        Toast.makeText(this, getString(R.string.capstone_toast_text), Toast.LENGTH_SHORT).show();
    }


}
