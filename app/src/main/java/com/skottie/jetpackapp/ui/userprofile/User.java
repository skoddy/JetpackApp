package com.skottie.jetpackapp.ui.userprofile;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey
    private int id;
    private long last_update;
    private String displayName;
    public User() {}

    public User(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
