package com.skottie.jetpackapp.ui.userprofile;

import com.skottie.jetpackapp.UserRepository;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class UserProfileViewModel extends ViewModel {
    private String userId;
    private LiveData<User> user;
    private UserRepository userRepo;

    // Provide the UserRepository parameter
    @Inject
    public UserProfileViewModel(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void init(String userId) {
        if (this.user != null) {
            return;
        }
        user = userRepo.getUser(userId);
    }
    public LiveData<User> getUser() {
        return this.user;
    }
}
