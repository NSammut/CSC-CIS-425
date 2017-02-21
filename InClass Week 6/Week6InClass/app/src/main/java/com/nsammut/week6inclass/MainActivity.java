package com.nsammut.week6inclass;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alertNotification(View v)
    {
        //Toast.makeText(this, "Testing", Toast.LENGTH_LONG).show();
        AlertDialog.Builder builder =  new AlertDialog.Builder(this);
        builder.setMessage("Hello 425!")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
    public void progressDialog(View v)
    {
        ProgressDialog progress = ProgressDialog.show(this, "", "Loading, Please Wait...");
        progress.show();
    }
}
