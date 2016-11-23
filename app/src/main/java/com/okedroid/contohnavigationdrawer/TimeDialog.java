package com.okedroid.contohnavigationdrawer;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by RAW-ON on 23/11/2016.
 */

public  class TimeDialog extends DialogFragment implements TimePickerDialog.OnTimeSetListener{
    EditText txtTime;
    public TimeDialog(View view){
        txtTime=(EditText)view;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c =Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        return new TimePickerDialog(getActivity(),this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(TimePicker view, int hour, int minute) {
        String time=hour+":"+minute;
        txtTime.setText(time);
    }
}
