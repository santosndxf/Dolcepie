package com.example.signupdolcepie.SignUp.utils;

import  com.example.signupdolcepie.SignUp.data.signup;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface signupservice {


    @POST("api/v1/auth/signup")
    Call<String> signUpUser(@Body signup signup);
}