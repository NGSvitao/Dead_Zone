package com.example.deadzone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.deadzone.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v ->
                NavHostFragment.findNavController(SecondFragment.this).navigateUp()
        );

        binding.btnShare.setOnClickListener(v ->
                Toast.makeText(getContext(), "Compartilhando jogo...", Toast.LENGTH_SHORT).show()
        );

        binding.btnDetailsWishlist.setOnClickListener(v ->
                Toast.makeText(getContext(), "Adicionado à Lista de Desejos!", Toast.LENGTH_SHORT).show()
        );

        binding.btnDetailsBuy.setOnClickListener(v ->
                Toast.makeText(getContext(), "Redirecionando para o Pagamento...", Toast.LENGTH_SHORT).show()
        );

        binding.btnDetailsAddCart.setOnClickListener(v ->
                Toast.makeText(getContext(), "Jogo adicionado ao Carrinho!", Toast.LENGTH_SHORT).show()
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}