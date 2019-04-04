package com.skottie.jetpackapp;

import com.skottie.jetpackapp.ui.userprofile.User;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface UserDao {

    @Insert(onConflict = REPLACE)
    void save(User user);

    @Query("SELECT * FROM user WHERE id = :userId")
    LiveData<User> load(String userId);

    @Query("SELECT COUNT(*) FROM user WHERE id == :userId AND last_update >= :timeout")
    int hasUser(int userId, long timeout);
}
