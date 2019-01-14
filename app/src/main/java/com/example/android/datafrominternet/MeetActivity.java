package com.example.android.datafrominternet;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MeetActivity  extends Activity implements View.OnClickListener{

    Button meetBackButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet);

         meetBackButton=(Button)findViewById(R.id.action_meet_back);
         meetBackButton.setOnClickListener(MeetActivity.this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this,MainActivity.class);
        this.startActivity(i);
    }
}
