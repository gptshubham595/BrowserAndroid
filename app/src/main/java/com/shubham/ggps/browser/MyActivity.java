package com.shubham.ggps.browser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MyActivity extends Activity {
    Button btn,btn2,fb,google,twitter,pinterest,yahoo,gmail,youtube,shubham,instagram;
    EditText url,t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        fb=(Button)findViewById(R.id.fb);
        google=(Button)findViewById(R.id.google);
        twitter=(Button)findViewById(R.id.twitter);
        pinterest=(Button)findViewById(R.id.pinterest);
        yahoo=(Button)findViewById(R.id.yahoo);
        gmail=(Button)findViewById(R.id.gmail);
        youtube=(Button)findViewById(R.id.youtube);
        shubham=(Button)findViewById(R.id.shubham);
        instagram=(Button)findViewById(R.id.instagram);
        btn=(Button)findViewById(R.id.search);
        url=(EditText)findViewById(R.id.url);

        btn2=(Button)findViewById(R.id.home);
        t=(EditText)findViewById(R.id.url);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(),Url.class);
                i1.putExtra("url","https://www.fb.com");
                startActivity(i1);
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), Url.class);
                i2.putExtra("url", "https://www.google.com");
                startActivity(i2);
            }
        });
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getApplicationContext(), Url.class);
                i3.putExtra("url", "https://www.gmail.com");
                startActivity(i3);
            }
        });
        yahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(getApplicationContext(), Url.class);
                i4.putExtra("url", "https://www.yahoo.com");
                startActivity(i4);
            }
        });
        pinterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(getApplicationContext(), Url.class);
                i5.putExtra("url", "https://www.pinterest.com");
                startActivity(i5);

            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(getApplicationContext(), Url.class);
                i6.putExtra("url", "https://www.twitter.com");
                startActivity(i6);

            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7 = new Intent(getApplicationContext(), Url.class);
                i7.putExtra("url", "https://www.youtube.com");
                startActivity(i7);

            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8 = new Intent(getApplicationContext(), Url.class);
                i8.putExtra("url", "https://www.instagram.com");
                startActivity(i8);

            }
        });
        shubham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9 = new Intent(getApplicationContext(), Url.class);
                i9.putExtra("url", "https://www.shubhamggsps.blogspot.com");
                startActivity(i9);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MyActivity.class);
                startActivity(i);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenWesite();

            }

            private void OpenWesite() {
                String add=url.getText().toString();
                if(TextUtils.isEmpty(add))
                {
                    Toast.makeText(MyActivity.this,"Please Enter url",Toast.LENGTH_LONG).show();

                }
                else{
                    String url_no_https= add.replaceAll("https://www.","");
                    String http="https://";
                    String www="www.";
                    Intent m=new Intent(getApplicationContext(),Url.class);
                    Toast.makeText(MyActivity.this,http+www+url_no_https,Toast.LENGTH_LONG).show();
                    m.putExtra("url",http+www+url_no_https);
                    startActivity(m);

                }
            }
        });
    }



}
