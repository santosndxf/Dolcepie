package com.example.signupdolcepie.home.presetation;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.signupdolcepie.R;

public class homeadm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homeadm);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button produtosBtn = findViewById(R.id.produtos_btn);
        Button usuariosBtn = findViewById(R.id.usuarios_btn);
produtosBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            renderFragment(new ProdutosF());
        }
    });
}

public void renderFragment(ProdutosF f)
{
    FragmentManager fragmanager = getSupportFragmentManager();
    FragmentTransaction ft = fragmanager.beginTransaction();
    ft.replace(R.id.pf,f);
    ft.commit();
}

    }
