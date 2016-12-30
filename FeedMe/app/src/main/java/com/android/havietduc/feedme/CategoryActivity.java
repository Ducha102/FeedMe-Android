package com.android.havietduc.feedme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CategoryActivity extends AppCompatActivity {
   private WebView prodView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        addControl();
    }

    private void addControl() {
        prodView = (WebView) findViewById(R.id.productView);

        prodView.getSettings().setJavaScriptEnabled(true);

        prodView.loadUrl("http://www.google.com");
    }
}
