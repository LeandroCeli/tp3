package com.example.tp03_libros.ui.detail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tp03_libros.databinding.ActivityDetailBinding;


public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String titulo = getIntent().getStringExtra("titulo");
        String autor = getIntent().getStringExtra("autor");
        String descripcion = getIntent().getStringExtra("descripcion");

        binding.tvTitulo.setText(titulo != null ? titulo : "No encontrado");
        binding.tvAutor.setText(autor != null ? autor : "");
        binding.tvDescripcion.setText(descripcion != null ? descripcion : "Libro no encontrado");
    }
}