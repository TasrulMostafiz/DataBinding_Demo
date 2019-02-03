package com.example.tasrul.databinding_demo.ViewModel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.tasrul.databinding_demo.BR;


/**
 * Created by tasrul on 03-Feb-19.
 */

public class UserModel extends BaseObservable {

    String email;
    String pass;

    public UserModel() {
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
        notifyPropertyChanged(BR.pass);
    }
}
