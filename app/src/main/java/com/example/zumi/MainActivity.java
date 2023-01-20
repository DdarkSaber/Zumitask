package com.example.zumi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView agree , readless ,terms;
        Button getotp;
        EditText input;
        CheckBox tick;
        agree = findViewById(R.id.termsandagreement);
        terms = findViewById(R.id.terms);
        readless = findViewById(R.id.readless);
        getotp = findViewById(R.id.getotp);
        input = findViewById(R.id.getusernumber);
        tick = findViewById(R.id.agreement);

      tick.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
              String phno = input.getText().toString();
              boolean check = tick.isChecked();
              if (!phno.isEmpty() && check )
                  getotp.setEnabled(true);
              else
                  getotp.setEnabled(false);
          }
      });

      readless.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if(readless.getText()=="readless") {
                  agree.setText(R.string.sml);
                  readless.setText("readmore");
              }
              else{
                  agree.setText(R.string.lng);
                  readless.setText("readless");
              }

          }
      });




    }
}