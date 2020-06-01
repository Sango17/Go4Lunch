package com.alexandreseneviratne.go4lunch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.alexandreseneviratne.go4lunch.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            return;
        }

        transaction = getSupportFragmentManager().beginTransaction();

        toTest();
    }

    /**
     * Displays test view
     */
    public void toTest() {
        // Create a Logging Fragment to be placed in the activity layout
        MainFragment mainFragment = new MainFragment();

        // In case this activity was started with special instructions from an
        // Intent, pass the Intent's extras to the fragment as arguments
        mainFragment.setArguments(getIntent().getExtras());

        // Add the fragment to the 'container' FrameLayout
        transaction.replace(R.id.container, mainFragment).commitNow();
    }
}
