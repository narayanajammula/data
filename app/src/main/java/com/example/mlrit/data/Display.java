package com.example.mlrit.data;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);


        Bundle b=getIntent().getExtras();

        TextView name=(TextView) findViewById(R.id.tv);
        TextView age=(TextView) findViewById(R.id.tv1);
        TextView gender=(TextView) findViewById(R.id.tv2);

        name.setText(b.getCharSequence("name"));
        age.setText(b.getCharSequence("age"));
        gender.setText(b.getCharSequence("gender"));

    }
}
