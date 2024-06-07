package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    TextView t;
    AutoCompleteTextView tv;
    String[] countries={"India","Australia","New York","Africa","Nepal","Russia","Singapore"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=findViewById(R.id.textview1);
        tv=findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> a=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,countries);
        tv.setThreshold(1);
        tv.setAdapter(a);


    }
}