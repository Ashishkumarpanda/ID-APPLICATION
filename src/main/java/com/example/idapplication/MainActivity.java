package com.example.idapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edText;
    Button btnSub;
    TextView tvSt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edText=findViewById(R.id.edText);
        btnSub=findViewById(R.id.btnSub);
        tvSt=findViewById(R.id.tvSt);
        tvSt.setVisibility(View.GONE);

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name="Ashish kumar panda";

                String text=(getString(R.string.name)+Name);
                tvSt.setText(text);
                tvSt.setVisibility(View.VISIBLE);
            }
        });


    }
}
