package com.shubham.ggps.browser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class splash extends Activity {
Thread a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        a=new Thread(){
            public void run(){
             try{
                 a.sleep(7000);
                 Intent i=new Intent(getApplicationContext(),MyActivity.class);
                 startActivity(i);
             }catch (Exception e){


             }
            }

        };
        a.start();
    }


}
