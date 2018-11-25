package com.example.shakeddromi.targil02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn;
int x=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById (R.id.button);
        }

    public void ClickNumber(View view) {
        x++;
        btn.setText("this is click number - "+x);
    }
}
