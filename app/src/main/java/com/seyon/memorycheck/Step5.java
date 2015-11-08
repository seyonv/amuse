package com.seyon.memorycheck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

public class Step5 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step5);
        final ImageView image1=(ImageView) findViewById(R.id.image1);
        hide_image(image1);

    }
    public void start_step6(View view){
        Intent intent = new Intent(this,Step6.class);
        startActivity(intent);
    }
    public void hide_image(final ImageView image)
    {
        image.postDelayed(new Runnable() {
            public void run() {
                // image.setVisibility(View.INVISIBLE);
                image.setImageBitmap(null);
            }
        }, 4000);

    }

}
