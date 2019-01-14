package com.example.android.datafrominternet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.view.View;

public class ContactActivity extends Activity  {

    Button mBackButton;
    Button mProceedButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        mBackButton = (Button) findViewById(R.id.action_back);


        final Intent intent= new Intent();
        intent.setClass(ContactActivity.this, MainActivity.class);

        // mBackButton.setOnClickListener(this);

       // mProceedButton = (Button) findViewById(R.id.action_proceed);
        //  mProceedButton.setOnClickListener(this);


        mBackButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Intent i = new Intent(ContactActivity.this, MainActivity.class);


                startActivity(intent);

            }
        });

        mProceedButton = (Button) findViewById(R.id.action_proceed);
        final Intent intentt= new Intent();
        intent.setClass(ContactActivity.this, OutputActivity.class);

        mProceedButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent j = new Intent(ContactActivity.this, OutputActivity.class);
                startActivity(intentt);

            }
        });


     }


}



