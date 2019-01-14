package com.example.android.datafrominternet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class OutputActivity extends AppCompatActivity {

    TextView textView;
     ImageView imageView,imageGraphView;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        textView =(TextView)findViewById(R.id.textchange);
        imageView=(ImageView) findViewById(R.id.image_output_id);
        imageGraphView=(ImageView) findViewById(R.id.image_graph_id);

        button=(Button)findViewById(R.id.check);

        final Intent intent= new Intent();
        intent.setClass(OutputActivity.this, CheckScaleActivity.class);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                startActivity(intent);

            }
        });

        Random rnd = new Random();
        int x=rnd.nextInt(1);
        switch(x){
            case 0:
                textView.setText("You are all good");
                imageView.setImageResource(R.mipmap.happy);
                int y=rnd.nextInt(1);
                switch (y){
                    case 0:
                        imageGraphView.setImageResource(R.mipmap.ic);
                        break;
                    case 1:
                        imageGraphView.setImageResource(R.mipmap.ip);
                        break;

                }
                //imageGraphView.setImageResource(R.mipmap.happy);
                button.setText("Check with scale");
                break;
            case 1:
                textView.setText("We suspect you are depressed");
                imageView.setImageResource(R.mipmap.worry);
                int z=rnd.nextInt(1);
                switch (z){
                    case 0:
                        imageGraphView.setImageResource(R.mipmap.ic);
                        break;
                    case 1:
                        imageGraphView.setImageResource(R.mipmap.ip);
                        break;

                }
                //imageGraphView.setImageResource(R.mipmap.worry);
                button.setText("Check with scale");
                break;


        }
    }

}
