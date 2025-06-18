package com.example.signupdolcepie.SignUp.utils;


import com.example.signupdolcepie.SignUp.data.signup;

import com.example.signupdolcepie.shared.utils.RetroFitCliente;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

    public class SignUplibs {

        private String resp;

        public SignUplibs() {
        }

        public String SignupUser(signup signup) {
            signupservice service = RetroFitCliente
                    .getRetrofitInstance()
                    .create(signupservice.class);
            Call<String> call = service.signUpUser(signup);
            call.enqueue(new Callback<String>() {
                @Override
                public void onResponse(Call<String> call, Response<String> response) {
                    if (response.isSuccessful()) {
                        resp = response.body();
                    }
                }

                @Override
                public void onFailure(Call<String> call, Throwable t) {

                    resp = "Não foi possivel cadastrar o usuario";

                }
            });

            return resp;
        }
    }
}


