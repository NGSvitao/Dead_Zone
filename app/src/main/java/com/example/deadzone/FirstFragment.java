package com.example.deadzone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.deadzone.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Navigation Helper method to open details fragment
        View.OnClickListener openDetailsListener = v ->
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);

        // Click listeners for game cards to open Game Details screen
        binding.cardHero.setOnClickListener(openDetailsListener);
        binding.btnBuyNow.setOnClickListener(openDetailsListener);

        binding.cardFlash1.setOnClickListener(openDetailsListener);
        binding.cardFlash2.setOnClickListener(openDetailsListener);
        binding.cardFlash3.setOnClickListener(openDetailsListener);

        binding.cardBest1.setOnClickListener(openDetailsListener);
        binding.cardBest2.setOnClickListener(openDetailsListener);
        binding.cardBest3.setOnClickListener(openDetailsListener);
        binding.cardBest4.setOnClickListener(openDetailsListener);

        binding.cardUpcoming1.setOnClickListener(openDetailsListener);
        binding.cardUpcoming2.setOnClickListener(openDetailsListener);

        // Secondary Action Listeners
        binding.btnBookmark.setOnClickListener(v ->
                Toast.makeText(getContext(), "Adicionado à Lista de Desejos!", Toast.LENGTH_SHORT).show()
        );

        binding.btnSubscribeVip.setOnClickListener(v ->
                Toast.makeText(getContext(), "Assinar Clube VIP Tático - R$ 19,90/mês", Toast.LENGTH_SHORT).show()
        );

        // Filter chips listeners
        binding.chipTodos.setOnClickListener(v ->
                Toast.makeText(getContext(), "Exibindo Todos os Jogos", Toast.LENGTH_SHORT).show()
        );
        binding.chipPc.setOnClickListener(v ->
                Toast.makeText(getContext(), "Filtrando por PC / Steam", Toast.LENGTH_SHORT).show()
        );
        binding.chipPs5.setOnClickListener(v ->
                Toast.makeText(getContext(), "Filtrando por PlayStation 5", Toast.LENGTH_SHORT).show()
        );
        binding.chipXbox.setOnClickListener(v ->
                Toast.makeText(getContext(), "Filtrando por Xbox Series", Toast.LENGTH_SHORT).show()
        );

        binding.btnSeeAllFlash.setOnClickListener(v ->
                Toast.makeText(getContext(), "Todas as Ofertas Relâmpago", Toast.LENGTH_SHORT).show()
        );
        binding.btnSeeAllBest.setOnClickListener(v ->
                Toast.makeText(getContext(), "Ranking Completo dos Mais Vendidos", Toast.LENGTH_SHORT).show()
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}