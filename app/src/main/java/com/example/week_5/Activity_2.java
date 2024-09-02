package com.example.week_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity_2 extends AppCompatActivity {

    private LinearLayout ll;
    private TextView txtUsr;
    private EditText txtViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        this.ll=(LinearLayout) findViewById(R.id.ll);
        this.txtUsr = (TextView) findViewById(R.id.lbluser);
        this.txtViews=(EditText) findViewById(R.id.txtNoofViews);

        Intent i = getIntent(); // Retrieving the Intent that started the Activity
        String user_name = i.getStringExtra("user_name"); // Retrieving data from the Intent
        String user_type = i.getStringExtra("user_type");
        txtUsr.setText("Welcome " + user_name + ". You have logged in as "+ user_type);
    }
    public void createViews(View view) {
        for (int i = 1; i <= Integer.parseInt(txtViews.getText().toString()); i++) {
            TextView textView = new TextView(this);
            textView.setText("talk to Doctor " + i);
            textView.setTextSize(20);
            textView.setGravity(Gravity.CENTER);  // TextViews will be Centered to the Layout
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            ll.addView(textView);   // Add the newly created TextView to the Layout
        }
    }
}