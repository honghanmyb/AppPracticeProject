package com.example.dialogforalert;

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

    public void onClickShowAlert(View view) {
        AlertDialog.Builder mAlertBuilder = new AlertDialog.Builder(MainActivity.this);
        mAlertBuilder.setTitle(R.string.alert_title);
        mAlertBuilder.setMessage(getString(R.string.alert_message));

        mAlertBuilder.setPositiveButton(R.string.ok_button, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "press OK",
                        Toast.LENGTH_SHORT).show();
            }
        });

        mAlertBuilder.setNegativeButton(R.string.cancel_button, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Press cancel",
                        Toast.LENGTH_SHORT).show();
            }
        });

        mAlertBuilder.show();
    }
}
