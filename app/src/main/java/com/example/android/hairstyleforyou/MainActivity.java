package com.example.android.hairstyleforyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spShape;
    private Spinner spLength;
    private Button btnSearch;
    private List<String> shapeType, lengthType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spShape = (Spinner) findViewById(R.id.sp_shape);
        spLength = (Spinner) findViewById(R.id.sp_length);
        btnSearch = (Button) findViewById(R.id.btn_search);

        shapeType = new ArrayList<String>();
        shapeType.add("Round");
        shapeType.add("Heart");
        shapeType.add("Oval / Long");
        shapeType.add("Square");

        lengthType = new ArrayList<String>();
        lengthType.add("Short");
        lengthType.add("Medium");
        lengthType.add("Long");

        ArrayAdapter<String> shapeTypeAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,shapeType);
        ArrayAdapter<String> lengthTypeAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, lengthType);

        spShape.setAdapter(shapeTypeAdapter);
        spLength.setAdapter(lengthTypeAdapter);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean valid = true;

                if (valid)
                {
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("shapeType", spShape.getSelectedItem().toString());
                    intent.putExtra("lengthType", spLength.getSelectedItem().toString());
                    startActivity(intent);
                }
            }
        });

//        btnSearch.setOnClickListener(
//
//                boolean valid = true;
//
//                if (valid)
//                {
//                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
//                    intent.putExtra("shapeType", spShape.getSelectedItem().toString());
//                    intent.putExtra("lengthType", spLength.getSelectedItem().toString());
//                    startActivity(intent);
//                }
//        );

    }
}
