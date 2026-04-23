package com.example.tp03_libros.viewmodel;

import androidx.lifecycle.ViewModel;


import com.example.tp03_libros.data.LibroRepository;
import com.example.tp03_libros.model.Libro;

import java.util.List;

public class LibroViewModel extends ViewModel {

    public Libro buscarLibro(String nombre) {

        List<Libro> lista = LibroRepository.obtenerLibros();

        for (Libro libro : lista) {
            if (libro.getTitulo().equalsIgnoreCase(nombre)) {
                return libro;
            }
        }

        return null;
    }
}
