package com.project_sajal.alert;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setTitle("Be Alert");
        builder.setMessage("You are about to play Tic Tac Toe");
        builder.setNeutralButton("ok", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Hi, Welcome", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}