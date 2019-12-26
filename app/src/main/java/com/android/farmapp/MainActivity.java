package com.android.farmapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    /* renamed from: com.example.vignesh.applicationrelaunch.MainActivity.1 */
    class C01391 implements Runnable {
        C01391() {
        }

        public void run() {
            MainActivity.this.startActivity(new Intent(MainActivity.this, Welcome.class));
            MainActivity.this.overridePendingTransition(R.anim.right_in, R.anim.left_out);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new C01391(), 5000);
    }
}
