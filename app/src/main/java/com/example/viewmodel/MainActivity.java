package com.example.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.viewmodel.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {
    MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        TextView textView = findViewById(R.id.textView);
        Button add = findViewById(R.id.button);
        textView.setText(String.valueOf(viewModel.getNumber()));

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.addOne();
                textView.setText(String.valueOf(viewModel.getNumber()));
            }
        });

    }
}