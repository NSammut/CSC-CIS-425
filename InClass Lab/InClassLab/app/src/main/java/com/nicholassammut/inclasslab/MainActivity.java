package com.nicholassammut.inclasslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txtView;
    String toastString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        txtView = (TextView) findViewById(R.id.txtView);
        toastString = "This is my second in class exercise in CSC 425.";
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText("Nick clicked the button.");
                Toast.makeText(MainActivity.this, toastString, Toast.LENGTH_LONG).show();
            }
        });
    }
}
