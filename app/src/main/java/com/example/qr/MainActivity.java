package com.example.qr;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends Activity {

    ImageView imageView;
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = this;
        editText = findViewById(R.id.edit_text);
        btn = findViewById(R.id.btn);
        imageView = findViewById(R.id.imageView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().length() > 0) {
                    String str = "https://api.qrserver.com/v1/create-qr-code/?data=" + editText.getText().toString() + "&size=100x100";
//                    Picasso.with(context).load("https://api.qrserver.com/v1/create-qr-code/?data=" + editText.getText().toString() + "&size=100x100").into(imageView);
                    Picasso.with(context).load(str).into(imageView);
                }
            }
        });
    }
}