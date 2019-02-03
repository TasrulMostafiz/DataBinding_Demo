package com.example.tasrul.databinding_demo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tasrul.databinding_demo.ViewModel.UserModel;
import com.example.tasrul.databinding_demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        UserModel userModel=new UserModel();
        userModel.setEmail("sakib");
        userModel.setPass("sakib123");
        activityMainBinding.setUser(userModel);


    }
}
