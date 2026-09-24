package com.example.deadzone;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.deadzone.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(binding.main, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.btnSearch.setOnClickListener(v ->
                Toast.makeText(this, "Pesquisar jogos...", Toast.LENGTH_SHORT).show()
        );

        binding.layoutCart.setOnClickListener(v ->
                Toast.makeText(this, "Carrinho (3 itens)", Toast.LENGTH_SHORT).show()
        );

        binding.imgProfile.setOnClickListener(v ->
                Toast.makeText(this, "Perfil do Jogador", Toast.LENGTH_SHORT).show()
        );

        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.navigation_home) {
                Toast.makeText(this, "Início", Toast.LENGTH_SHORT).show();
                return true;
            } else if (id == R.id.navigation_games) {
                Toast.makeText(this, "Catálogo de Jogos", Toast.LENGTH_SHORT).show();
                return true;
            } else if (id == R.id.navigation_offers) {
                Toast.makeText(this, "Ofertas Especiais", Toast.LENGTH_SHORT).show();
                return true;
            } else if (id == R.id.navigation_wishlist) {
                Toast.makeText(this, "Lista de Desejos", Toast.LENGTH_SHORT).show();
                return true;
            } else if (id == R.id.navigation_profile) {
                Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        });
    }
}