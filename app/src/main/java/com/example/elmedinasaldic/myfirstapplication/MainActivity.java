package com.example.elmedinasaldic.myfirstapplication;

import android.annotation.SuppressLint;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView Info = (TextView) findViewById(R.id.Info);
        Button MyPalindrom = (Button) findViewById(R.id.MyPalindrom);
        final EditText StringPalindrom = (EditText) findViewById(R.id.StringPalindrom);

        MyPalindrom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String input = StringPalindrom.getText().toString();

                if(input == null || input.equals("")){
                    Info.setText("Keine Eingabe getätigt!");
                }else {
                    if (input.length() >= 5) {
                        if(isPalindrom(input.toLowerCase())){
                            Info.setText("Es ist ein Palindrom");
                        }else{
                            Info.setText("Es ist kein Palindrom" + input);
                        }
                    } else {
                        Info.setText("Zu wenig Zeichen!");
                    }
                }
            }
        });
    }

    public static boolean isPalindrom(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
