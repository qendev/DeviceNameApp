package com.example.devicenameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;

import java.util.UUID;

public class UUidActivity extends AppCompatActivity {
    TextView textView;
    private String androidDeviceId;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uuid);
        textView = (TextView) findViewById(R.id.android_device_unique_id);

        androidDeviceId = Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID);


        textView.setText("Your Device ID Address: " + androidDeviceId);


    }



}
