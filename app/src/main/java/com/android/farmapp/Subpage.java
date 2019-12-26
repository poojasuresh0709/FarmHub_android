package com.android.farmapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat.WearableExtender;
import android.support.v4.media.TransportMediator;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Subpage extends ActionBarActivity {
    TextView Headlbl;
    String Name;
    ImageView buttonimg;
    ImageView img;
    MediaPlayer mPlayer;
    TextView mp3desc;
    Boolean playstatus;

    public Subpage() {
        this.playstatus = Boolean.valueOf(false);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(BuildConfig.FLAVOR);
        setContentView((int) R.layout.activity_subpage);
        this.img = (ImageView) findViewById(R.id.imageView3);
        this.Headlbl = (TextView) findViewById(R.id.textView);
        this.mp3desc = (TextView) findViewById(R.id.textView2);
        this.Name = getIntent().getExtras().getString("Items");
        this.buttonimg = (ImageView) findViewById(R.id.imageView2);
        setcontenting();
        setTitle(BuildConfig.FLAVOR);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_subpage, menu);
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

    public void land_prepare(View view) {
        Bundle send = new Bundle();
        send.putString("Itemsnew", this.Name);
        send.putString("subcont", "land_prepare");
        Intent myint = new Intent(this, Content.class);
        myint.putExtras(send);
        startActivity(myint);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void Planting_material(View view) {
        Bundle send = new Bundle();
        send.putString("Itemsnew", this.Name);
        send.putString("subcont", "Planting_material");
        Intent myint = new Intent(this, Content.class);
        myint.putExtras(send);
        startActivity(myint);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void Planting_season(View view) {
        Bundle send = new Bundle();
        send.putString("Itemsnew", this.Name);
        send.putString("subcont", "Planting_season");
        Intent myint = new Intent(this, Content.class);
        myint.putExtras(send);
        startActivity(myint);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void Planting_Method(View view) {
        Bundle send = new Bundle();
        send.putString("Itemsnew", this.Name);
        send.putString("subcont", "Planting_Method");
        Intent myint = new Intent(this, Content.class);
        myint.putExtras(send);
        startActivity(myint);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void Nutrition(View view) {
        Bundle send = new Bundle();
        send.putString("Itemsnew", this.Name);
        send.putString("subcont", "Nutrition");
        Intent myint = new Intent(this, Content.class);
        myint.putExtras(send);
        startActivity(myint);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void irrigation(View view) {
        Bundle send = new Bundle();
        send.putString("Itemsnew", this.Name);
        send.putString("subcont", "irrigation");
        Intent myint = new Intent(this, Content.class);
        myint.putExtras(send);
        startActivity(myint);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void Diseases(View view) {
        Bundle send = new Bundle();
        send.putString("Itemsnew", this.Name);
        send.putString("subcont", "Diseases");
        Intent myint = new Intent(this, Content.class);
        myint.putExtras(send);
        startActivity(myint);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void Harvesting_yield(View view) {
        Bundle send = new Bundle();
        send.putString("Itemsnew", this.Name);
        send.putString("subcont", "Harvesting_yield");
        Intent myint = new Intent(this, Content.class);
        myint.putExtras(send);
        startActivity(myint);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    public void setcontenting() {
        String str = this.Name;
        switch (str) {
            case "banana":
                this.img.setImageResource(R.drawable.banana);
                this.Headlbl.setText("Banana");
                this.mp3desc.setText("banana.mp3");
                break;
            case "cashew":
                this.img.setImageResource(R.drawable.cashew);
                this.Headlbl.setText("Cahew");
                this.mp3desc.setText("cahew.mp3");
                break;
            case "coconut":
                this.img.setImageResource(R.drawable.coconut);
                this.Headlbl.setText("Coconut");
                this.mp3desc.setText("coconut.mp3");
                break;
            case "jasmine":
                this.img.setImageResource(R.drawable.jasmine);
                this.Headlbl.setText("Jasmine");
                this.mp3desc.setText("jasmine.mp3");
                break;
            case "jowar":
                this.img.setImageResource(R.drawable.jawar);
                this.Headlbl.setText("Jowar");
                this.mp3desc.setText("jowar.mp3");
                break;
            default:
        }
    }

    public void playmusic(View view) {
        if (this.playstatus.booleanValue()) {
            this.mPlayer.stop();
            this.buttonimg.setImageResource(R.drawable.ic_volume_up_white_48dp_2x);
            this.playstatus = false;
            return;
        }
        this.buttonimg.setImageResource(R.drawable.ic_volume_off_white_48dp_1x);
        String str = this.Name;

        switch (str) {
            case "banana":
                this.mPlayer = MediaPlayer.create(this, R.raw.banana);
                this.mPlayer.start();
                this.playstatus = Boolean.valueOf(true);
                break;
            case "cashew":
                this.mPlayer = MediaPlayer.create(this, R.raw.cashew);
                this.mPlayer.start();
                this.playstatus = Boolean.valueOf(true);
                break;
            case "coconut":
                this.mPlayer = MediaPlayer.create(this, R.raw.coconut);
                this.mPlayer.start();
                this.playstatus = Boolean.valueOf(true);
                break;
            case "jasmine":
                this.mPlayer = MediaPlayer.create(this, R.raw.jasmine);
                this.mPlayer.start();
                this.playstatus = Boolean.valueOf(true);
                break;
            case "jowar":
                this.mPlayer = MediaPlayer.create(this, R.raw.jowar);
                this.mPlayer.start();
                this.playstatus = Boolean.valueOf(true);
                break;
            default:
        }
    }
}
