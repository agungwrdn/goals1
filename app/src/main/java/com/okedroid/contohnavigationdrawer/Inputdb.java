package com.okedroid.contohnavigationdrawer;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by RAW-ON on 24/11/2016.
 */

public class Inputdb extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        EditText ettitle = (EditText) findViewById(R.id.editText);
        EditText etdate = (EditText) findViewById(R.id.editTextDate);
        EditText ettime = (EditText) findViewById(R.id.editTexttime);
        Button add = (Button) findViewById(R.id.buttonAdd);

        findViewById(R.id.buttonAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
