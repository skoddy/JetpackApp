package com.skottie.jetpackapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.skottie.jetpackapp.ui.userprofile.UserProfileFragment;

public class UserProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, UserProfileFragment.newInstance())
                    .commitNow();
        }
    }
}
