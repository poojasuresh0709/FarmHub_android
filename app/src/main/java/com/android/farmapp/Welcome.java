package com.android.farmapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.android.farmapp.R;

public class Welcome extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        setTitle(BuildConfig.FLAVOR);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                startActivity(new Intent(this, Contact.class));
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                return true;
            case R.id.send_feedback:
                Intent intent=new Intent(this,Feedback.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void banana(View view) {
        Bundle send = new Bundle();
        send.putString("Items", "banana");
        Intent myint = new Intent(this, Subpage.class);
        myint.putExtras(send);
        startActivity(myint);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void cashew(View view) {
        Bundle send = new Bundle();
        send.putString("Items", "cashew");
        Intent myint = new Intent(this, Subpage.class);
        myint.putExtras(send);
        startActivity(myint);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void coconut(View view) {
        Bundle send = new Bundle();
        send.putString("Items", "coconut");
        Intent myint = new Intent(this, Subpage.class);
        myint.putExtras(send);
        startActivity(myint);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void jasmine(View view) {
        Bundle send = new Bundle();
        send.putString("Items", "jasmine");
        Intent myint = new Intent(this, Subpage.class);
        myint.putExtras(send);
        startActivity(myint);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void jawar(View view) {
        Bundle send = new Bundle();
        send.putString("Items", "jowar");
        Intent myint = new Intent(this, Subpage.class);
        myint.putExtras(send);
        startActivity(myint);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }
}
