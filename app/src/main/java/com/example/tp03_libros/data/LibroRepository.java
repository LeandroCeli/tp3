package com.example.tp03_libros.data;



import com.example.tp03_libros.model.Libro;

import java.util.ArrayList;
import java.util.List;

public class LibroRepository {

    public static List<Libro> obtenerLibros() {

        List<Libro> lista = new ArrayList<>();

        lista.add(new Libro("1984", "George Orwell", "Distopía sobre control totalitario."));
        lista.add(new Libro("El Principito", "Antoine de Saint-Exupéry", "Historia filosófica."));
        lista.add(new Libro("Don Quijote", "Cervantes", "Aventuras del caballero."));
        lista.add(new Libro("Cien años de soledad", "García Márquez", "Realismo mágico."));

        return lista;
    }
}
