package com.example.android.hairstyleforyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView tvTitle, tvDesc;
    private ImageView img;

    private static final String OVAL_SHORT = "oval_short";
    private static final String OVAL_MEDIUM = "oval_medium";
    private static final String OVAL_LONG = "oval_long";

    private static final String SQUARE_SHORT = "square_short";
    private static final String SQUARE_MEDIUM = "square_medium";
    private static final String SQUARE_LONG = "square_long";

    private static final String ROUND_SHORT = "round_short";
    private static final String ROUND_MEDIUM = "round_medium";
    private static final String ROUND_LONG = "round_long";

    private static final String HEART_SHORT = "heart_short";
    private static final String HEART_MEDIUM = "heart_medium";
    private static final String HEART_LONG = "heart_long";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvTitle = findViewById(R.id.tv_title);
        tvDesc = findViewById(R.id.tv_desc);
        img = findViewById(R.id.img);

        Intent intent = getIntent();

        final String shapeType = intent.getStringExtra("shapeType");
        final String lengthType = intent.getStringExtra("lengthType");

        //String hairCut = getModel(shapeType, lengthType);
        switch (getModel(shapeType, lengthType)){
            case OVAL_SHORT:
                tvTitle.setText("Oval Face, Short");
                tvDesc.setText(getResources().getString(R.string.oval_short));
                img.setImageResource(R.drawable.oval_short);
                break;
            case OVAL_MEDIUM:
                tvTitle.setText("Oval Face, Medium-Length");
                tvDesc.setText(getResources().getString(R.string.oval_medium));
                img.setImageResource(R.drawable.oval_medium);
                break;
            case OVAL_LONG:
                tvTitle.setText("Oval Face, Long");
                tvDesc.setText(getResources().getString(R.string.oval_long));
                img.setImageResource(R.drawable.oval_long);
                break;
            case ROUND_SHORT:
                tvTitle.setText("Round Face, Short");
                tvDesc.setText(getResources().getString(R.string.round_short));
                img.setImageResource(R.drawable.round_short);
                break;
            case ROUND_MEDIUM:
                tvTitle.setText("Round Face, Medium-Length");
                tvDesc.setText(getResources().getString(R.string.round_medium));
                img.setImageResource(R.drawable.round_medium);
                break;
            case ROUND_LONG:
                tvTitle.setText("Round Face, Long");
                tvDesc.setText(getResources().getString(R.string.round_long));
                img.setImageResource(R.drawable.round_long);
                break;
            case HEART_SHORT:
                tvTitle.setText("Heart Face, Short");
                tvDesc.setText(getResources().getString(R.string.heart_short));
                img.setImageResource(R.drawable.heart_short);
                break;
            case HEART_MEDIUM:
                tvTitle.setText("Heart Face, Medium-Length");
                tvDesc.setText(getResources().getString(R.string.heart_medium));
                img.setImageResource(R.drawable.heart_medium);
                break;
            case HEART_LONG:
                tvTitle.setText("Heart Face, Long");
                tvDesc.setText(getResources().getString(R.string.heart_long));
                img.setImageResource(R.drawable.heart_long);
                break;
            case SQUARE_SHORT:
                tvTitle.setText("Square Face, Short");
                tvDesc.setText(getResources().getString(R.string.square_short));
                img.setImageResource(R.drawable.square_short);
                break;
            case SQUARE_MEDIUM:
                tvTitle.setText("Square Face, Medium-Length");
                tvDesc.setText(getResources().getString(R.string.square_medium));
                img.setImageResource(R.drawable.square_medium);
                break;
            case SQUARE_LONG:
                tvTitle.setText("Square Face, Long");
                tvDesc.setText(getResources().getString(R.string.square_long));
                img.setImageResource(R.drawable.square_long);
                break;
            default:
                break;
        }

    }

    public String getModel(String shapeType, String lengthType) {
        String ping = "";
        if (shapeType.equals("Round") && lengthType.equals("Short"))
        {
            ping = ROUND_SHORT;
        }
        else if (shapeType.equals("Round") && lengthType.equals("Medium")){
            ping = ROUND_MEDIUM;
        }
        else if (shapeType.equals("Round") && lengthType.equals("Long")){
            ping = ROUND_LONG;
        }
        else if (shapeType.equals("Oval / Long") && lengthType.equals("Short")){
            ping = OVAL_SHORT;
        }
        else if (shapeType.equals("Oval / Long") && lengthType.equals("Medium")){
            ping = OVAL_MEDIUM;
        }
        else if (shapeType.equals("Oval / Long") && lengthType.equals("Long")){
            ping = OVAL_LONG;
        }
        else if (shapeType.equals("Heart") && lengthType.equals("Short")){
            ping = HEART_SHORT;
        }
        else if (shapeType.equals("Heart") && lengthType.equals("Medium")){
            ping = HEART_MEDIUM;
        }
        else if (shapeType.equals("Heart") && lengthType.equals("Long")){
            ping = HEART_LONG;
        }
        else if (shapeType.equals("Square") && lengthType.equals("Short")){
            ping = SQUARE_SHORT;
        }
        else if (shapeType.equals("Square") && lengthType.equals("Medium")){
            ping = SQUARE_MEDIUM;
        }
        else if (shapeType.equals("Square") && lengthType.equals("Long")){
            ping = SQUARE_LONG;
        }

        return ping;
    }




}
