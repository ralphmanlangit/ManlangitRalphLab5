package com.manlangit.ralph;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.button1){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.buttonMAP2){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:48.8584,2.2945"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }
    }
}
