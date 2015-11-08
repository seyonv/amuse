package com.seyon.memorycheck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class Step4 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        setContentView(R.layout.activity_step4);

    }
    public void start_step5(View view){
      Intent intent = new Intent(this,Step5.class);
      startActivity(intent);
    }
}
