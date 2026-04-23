package com.example.tp03_libros.ui.main;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.tp03_libros.databinding.ActivityMainBinding;
import com.example.tp03_libros.model.Libro;
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

        binding.btnBuscar.setOnClickListener(v -> {

            String texto = binding.etLibro.getText().toString();
            Libro libro = viewModel.buscarLibro(texto);

            Intent intent = new Intent(MainActivity.this, DetailActivity.class);

            if (libro != null) {
                intent.putExtra("titulo", libro.getTitulo());
                intent.putExtra("autor", libro.getAutor());
                intent.putExtra("descripcion", libro.getDescripcion());
            }

            startActivity(intent);
        });
    }
}