package com.example.signupdolcepie.SignUp.presetation;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.signupdolcepie.R;
import com.example.signupdolcepie.SignUp.data.signup;
import com.example.signupdolcepie.SignUp.data.signupListener;
import com.example.signupdolcepie.SignUp.utils.SignUplibs;

public class SignUpActivity extends AppCompatActivity {

    private EditText name_field;
    private EditText email_field;
    private EditText Createpassword_field;
    private EditText confpass_field;
    private TextView issue_lb;
    private String issue = "*";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        name_field = findViewById(R.id.name_field);
        email_field = findViewById(R.id.email_field);
        Createpassword_field = findViewById(R.id.Createpassword_field);
        confpass_field = findViewById(R.id.confpass_field);

    }

    public void SignUpUser(View view)
    {
        String name = name_field.getText().toString();
        String email = email_field.getText().toString();
        String Createpassword = Createpassword_field.getText().toString();
        String confpass = confpass_field.getText().toString();
        if(name.isEmpty()) issue += "Campo nome e obrigatorio \n ";
        if(email.isEmpty()) issue += "Campo email e obrigatorio\n ";
        if(pass.isEmpty() || !pass.equals(cpass)) issue += "O campo senha e obrigatorio e deve ser igual a confirmação \n";
        if(issue.equals("*"))
        {
            SignUplibs libs = new SignUplibs();
            SignUp signup = new SignUp();
            signup.setName(name);
            signup.setEmail(mail);
            signup.setPassword(pass);
            Log.e("Etapa 1:","Esta funcional");
            libs.SignupUser(Signup);
            issue = libs.getResp();
        }
        issue_lb.setText(issue);
        issue_lb.setVisibility(VISIBLE);


    }
