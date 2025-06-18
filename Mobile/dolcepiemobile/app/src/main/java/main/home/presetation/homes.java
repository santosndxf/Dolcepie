package com.example.signupdolcepie.home.presetation;

import android.icu.lang.UCharacter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.signupdolcepie.R;
import com.example.signupdolcepie.home.data.ProdutosAdapter;
import com.example.signupdolcepie.home.data.Produtos;
import java.util.List;

public class homes extends AppCompatActivity {

    private RecyclerView Produtos_rv;
    private List<Produtos> produtos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        produtos_rv= findViewById(R.id.produtos_rv);
        produtos_rv.setLayoutManager(new LinearLayoutManager(this));
        produtos_rv.setHasFixedSize(true);

        ProdutosAdapter adapter = new ProdutosAdapter(this,produtos);
        produtos_rv.setAdapter(adapter);
    }
}