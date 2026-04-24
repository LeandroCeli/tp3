package com.example.tp03_libros.ui.main;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.tp03_libros.databinding.ActivityMainBinding;
import com.example.tp03_libros.model.Libro;
import com.example.tp03_libros.ui.detail.DetailActivity;
import com.example.tp03_libros.viewmodel.LibroViewModel;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private LibroViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(LibroViewModel.class);

        viewModel.getLibro().observe(this, libro -> {
            if (libro != null) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("titulo", libro.getTitulo());
                intent.putExtra("autor", libro.getAutor());
                intent.putExtra("descripcion", libro.getDescripcion());
                startActivity(intent);
            }
        });

        viewModel.getError().observe(this, errorMsg -> {
            if (errorMsg != null) {
                Toast.makeText(MainActivity.this, errorMsg, Toast.LENGTH_SHORT).show();
            }
        });

        binding.btnBuscar.setOnClickListener(v -> {
            String texto = binding.etLibro.getText().toString().trim();
            viewModel.buscarLibro(texto);
        });
    }
}