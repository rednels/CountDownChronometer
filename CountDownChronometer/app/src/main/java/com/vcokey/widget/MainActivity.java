package com.vcokey.widget;

import android.graphics.Typeface;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

     private Chronometer chronometer;
     private CountDownChronometer chronometer2;
    private EditText edit;
    private Button set,start,pause,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = (Chronometer) findViewById(R.id.chronometer);
        chronometer2 = (CountDownChronometer) findViewById(R.id.countdownchronometer);
        edit = (EditText) findViewById(R.id.edit);
        set = (Button) findViewById(R.id.set);
        start = (Button) findViewById(R.id.start);
        pause = (Button) findViewById(R.id.pause);
        reset = (Button) findViewById(R.id.reset);


        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.start();
        chronometer2.setFormat(" %s ", CountDownChronometer.FLAG_TIME_FORMAT_CUSTOM);
//        chronometer2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/UnidreamLED.ttf"));
        chronometer2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/number.TTF"));

        chronometer2.setOnChronometerTickListener(new CountDownChronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(CountDownChronometer chronometer) {

            }

            @Override
            public void onChronometerFinish(CountDownChronometer chronometer) {
                Toast.makeText(MainActivity.this,"时间到",Toast.LENGTH_SHORT).show();
            }
        });

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit.getText().length() == 0) {
                    Toast.makeText(MainActivity.this,"先输入倒计时时间再设置",Toast.LENGTH_SHORT).show();
                    return;
                }
                chronometer2.setTime(Integer.parseInt(edit.getText().toString().trim()));
            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer2.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer2.stop();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer2.goOn();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
