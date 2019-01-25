package com.concordia.cejv669.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.btn_ok);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                EditText t1 = findViewById(R.id.txt_name);

                Toast.makeText(getApplicationContext(),"Hello, my dear "+ t1.getText().toString(), Toast.LENGTH_LONG).show();

                CheckBox chk1=findViewById(R.id.checkBox);
                Switch sw1=findViewById(R.id.switch1);
                ToggleButton tb1=findViewById(R.id.toggleButton);
                RatingBar rb1=findViewById(R.id.ratingBar);
                rb1.setNumStars(6);
                Boolean checked = chk1.isChecked();
                Boolean switched = sw1.isChecked();
                Boolean toggled = tb1.isChecked();
                float starRating = rb1.getRating();


            }
        });

    }
    public void btn_pressed(View v)
    {
        EditText t1 = findViewById(R.id.txt_name);
        TextView tv1 = findViewById(R.id.lbl_show);

        tv1.setText("Hello, " + t1.getText().toString());

//        String x = tv1.getText().toString();
    }

}
