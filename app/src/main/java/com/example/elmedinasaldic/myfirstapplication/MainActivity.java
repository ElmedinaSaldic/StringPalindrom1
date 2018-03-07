package com.example.elmedinasaldic.myfirstapplication;

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
        String StringP;

    }

    public void MyPalindrom(View v) { //OnClick

        EditText StringP = (EditText) findViewById(R.id.StringPalindrom); //ID holen
        EditText Info = (EditText) findViewById(R.id.Info);
    }

    public static boolean isPalindrome(String StringP) {
        return StringP.equals(new StringBuilder(StringP).reverse().toString());
    }
}
