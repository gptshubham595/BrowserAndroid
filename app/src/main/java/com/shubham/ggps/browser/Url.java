package com.shubham.ggps.browser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Url extends Activity implements View.OnClickListener{
    Button btn2,search;
    EditText in;
    WebView web;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);
        btn2=(Button)findViewById(R.id.home2);
        search=(Button)findViewById(R.id.search);
        in=(EditText)findViewById(R.id.url);
        web=(WebView)findViewById(R.id.web);

        url=getIntent().getExtras().get("url").toString();
        in.setText(url);
        WebSettings webSettings=web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.loadUrl(url);
        web.setWebViewClient(new WebViewClient());
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Searchwebadd();
            }

            private void Searchwebadd() {

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MyActivity.class);
                startActivity(i);
            }
        });
        search.setOnClickListener(this);


    }

    @Override
    public void onBackPressed() {
        if(web.canGoBack()){
            web.goBack();
        }
        else{super.onBackPressed();}
    }

    @Override
    public void onClick(View v) {

        if(v == search){Searchme();}
    }

    private void Searchme() {
        String add=in.getText().toString();
        if(TextUtils.isEmpty(add))
        {
            Toast.makeText(Url.this, "Please Enter url", Toast.LENGTH_LONG).show();

        }
        else{
            String url_no_https= add.replaceAll("https://www.","");
            String http="https://";
            String www="www.";
            Intent m=new Intent(getApplicationContext(),Url.class);
            Toast.makeText(Url.this,http+www+url_no_https,Toast.LENGTH_LONG).show();
            m.putExtra("url",http+www+url_no_https);
            startActivity(m);

        }
    }
}
