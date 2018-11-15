package com.example.blaine.csc250;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);    //setContentView() sets what is displayed on the screen

        TextView appNameTV = (TextView)this.findViewById(R.id.appNameTV); //a method of an instance of the activity class
    }


    public void someButtonPressed(View v)
    {
        Button b = (Button)v;
        TextView appNameTV = (TextView)this.findViewById(R.id.appNameTV);
        appNameTV.setText(b.getText().toString());
    }
    public void LolButtonPressed(View v)
    {
        TextView appNameTV = (TextView)this.findViewById(R.id.appNameTV);
        appNameTV.setText("Hello");
    }
}
