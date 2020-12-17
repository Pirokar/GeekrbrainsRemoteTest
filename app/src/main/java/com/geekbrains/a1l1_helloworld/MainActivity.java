package com.geekbrains.a1l1_helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setOnBtnClickBehavior();
    }

    private void initViews() {
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
    }

    private void setOnBtnClickBehavior() {
        button.setOnClickListener(v -> {
            int color = ContextCompat.getColor(getApplicationContext(), R.color.black);
            textView.setText(getString(R.string.another_text));
            textView.setTextColor(color);
        });

        //This is array from resources
        String[] months = getResources().getStringArray(R.array.month);
    }
}