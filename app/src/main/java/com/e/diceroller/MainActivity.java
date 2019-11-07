package com.e.diceroller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView  message;
     EditText input;
     TextView tvCounter;
     Button LPDI;
     int count =0;
    ArrayList<String> SAL = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        InitialiseSAL();

        input = findViewById(R.id.editText3);
        message = findViewById(R.id.Message);
        tvCounter = findViewById(R.id.tvCounter);
        LPDI = findViewById(R.id.LPDI);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button but = findViewById(R.id.button);

        but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                on_button_click();
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


    public void on_button_click() {
        TextView tv = this.findViewById(R.id.numberTextView);

        Random r = new Random();
        int number = r.nextInt(7 - 1) + 1;
        tv.setText(Integer.toString(number));

        if (input.getText().toString().equals(Integer.toString(number))) {
            message.setText("  CONGRATULATIONS");
            count++;
            tvCounter.setText(Integer.toString(count));
            Toast.makeText(MainActivity.this, "CONGRATULATIONS", Toast.LENGTH_SHORT).show();
        } else {
            message.setText("Wrong");
        }

}

    public void on_dicebreaker_buton_click(View v) {
        LPDI = findViewById(R.id.LPDI);

        Random b = new Random();
        int number = b.nextInt(6-1) + 1;

        TextView tv = findViewById(R.id.textView);
        tv.setText(this.SAL.get(number-1));
    }
    private void InitialiseSAL() {

        SAL.add("if you could go anywhere in the world, where would you go?");
        SAL.add("if you were stranded on a desert island, what three things would you want to take with you?");
        SAL.add("if you could eat only one food for the rest of your life, what would that be?");
        SAL.add("if you won a million dollars, what is the first thing you would buy?");
        SAL.add("If you could spend he day with one fictional character, who would it be?");
        SAL.add("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
    }
}



















/*LPDI.setText(SAL.get(0));
                LPDI.setText(SAL.get(1));
                LPDI.setText(SAL.get(2));
                LPDI.setText(SAL.get(3));
                LPDI.setText(SAL.get(4));
                LPDI.setText(SAL.get(5));*/










