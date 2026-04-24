package com.example.tp03_libros.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tp03_libros.data.LibroRepository;
import com.example.tp03_libros.model.Libro;

import java.util.List;

public class LibroViewModel extends ViewModel {

    private final MutableLiveData<Libro> mLibro = new MutableLiveData<>();
    private final MutableLiveData<String> mError = new MutableLiveData<>();

    public LiveData<Libro> getLibro() {
        return mLibro;
    }

    public LiveData<String> getError() {
        return mError;
    }

    public void buscarLibro(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            mError.setValue("Por favor ingrese un libro");
            return;
        }

        List<Libro> lista = LibroRepository.obtenerLibros();
        boolean encontrado = false;

        for (Libro libro : lista) {
            if (libro.getTitulo().equalsIgnoreCase(nombre.trim())) {
                mLibro.setValue(libro);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            mError.setValue("Libro no encontrado");
        }
    }
}
