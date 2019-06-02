package com.example.whychat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EscolherPeriodo extends AppCompatActivity {
    private Button mBtnPeriodo1;
    private Button mBtnPeriodo2;
    private Button mBtnPeriodo3;
    private Button mBtnPeriodo4;
    private Button mBtnPeriodo5;
    private Button mBtnPeriodo6;
    private Button mBtnPeriodo7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher_periodo);

        mBtnPeriodo1 = findViewById(R.id.btnPeriodo1);
        mBtnPeriodo2 = findViewById(R.id.btnPeriodo2);
        mBtnPeriodo3 = findViewById(R.id.btnPeriodo3);
        mBtnPeriodo4 = findViewById(R.id.btnPeriodo4);
        mBtnPeriodo5 = findViewById(R.id.btnPeriodo5);
        mBtnPeriodo6 = findViewById(R.id.btnPeriodo6);
        mBtnPeriodo7 = findViewById(R.id.btnPeriodo7);

        mBtnPeriodo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EscolherPeriodo.this, QuizzActivity.class);
                intent.putExtra("periodo","1");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        mBtnPeriodo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EscolherPeriodo.this, QuizzActivity.class);
                intent.putExtra("periodo","2");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        mBtnPeriodo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EscolherPeriodo.this, QuizzActivity.class);
                intent.putExtra("periodo","3");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        mBtnPeriodo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EscolherPeriodo.this, QuizzActivity.class);
                intent.putExtra("periodo","4");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        mBtnPeriodo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EscolherPeriodo.this, QuizzActivity.class);
                intent.putExtra("periodo","5");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        mBtnPeriodo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EscolherPeriodo.this, QuizzActivity.class);
                intent.putExtra("periodo","6");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        mBtnPeriodo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EscolherPeriodo.this, QuizzActivity.class);
                intent.putExtra("periodo","7");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }
}
