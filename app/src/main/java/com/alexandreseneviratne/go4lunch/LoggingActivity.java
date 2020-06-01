package com.alexandreseneviratne.go4lunch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.alexandreseneviratne.go4lunch.ui.logging.LoggingViewModel;

public class LoggingActivity extends AppCompatActivity {
    private LoggingViewModel mViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logging_activity);

        mViewModel = ViewModelProviders.of(this).get(LoggingViewModel.class);
    }
}
