package com.okedroid.contohnavigationdrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ActionMode;
import android.view.View;
import android.widget.EditText;

/**
 * Created by RAW-ON on 23/11/2016.
 */

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_input);
    }

    public void onStart(){
        super.onStart();
        EditText txtDate=(EditText) findViewById(R.id.editTextDate);
        txtDate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(hasFocus){
                    DateDialog dialog = new DateDialog(view);
                    android.app.FragmentTransaction ft= getFragmentManager().beginTransaction();
                    dialog.show(ft, "DatePicker");

                }
            }
        });

    }
}
