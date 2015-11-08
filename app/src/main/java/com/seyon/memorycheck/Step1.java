package com.seyon.memorycheck;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Step1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        setContentView(R.layout.activity_step1);


       final ImageView image1=(ImageView) findViewById(R.id.image1);
        hide_image(image1);
        // want to delete imageview here


    }
    public void start_step2(View view){
        Intent intent = new Intent(this,Step2.class);
        startActivity(intent);
    }
    public void hide_image(final ImageView image)
    {
        image.postDelayed(new Runnable() {
            public void run() {
//                image.setVisibility(View.INVISIBLE);
                image.setImageBitmap(null);
            }
        }, 4000);
        // or want to delete imageview here

    }
}
