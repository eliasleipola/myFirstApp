package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Counter counter;

    private RadioButton hex,dec,bin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hex = (RadioButton) findViewById(R.id.radioHEX);
        dec = (RadioButton) findViewById(R.id.radioDEC);
        bin = (RadioButton) findViewById(R.id.radioBIN);

        counter = new Counter(100,-100,0,1);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioHEX:
        }
    }

    public void plusButtonPressed(View v){
        counter.add();
        updateUI();
    }

    public void minusButtonPressed(View v){
        counter.take();
        updateUI();
    }

    public void resetButtonPressed(View v){
        counter.zero();
        updateUI();
    }

    public void updateUI(){
        TextView tv = findViewById(R.id.textView);
        tv.setText(Integer.toString(counter.getLuku()));
    }
}