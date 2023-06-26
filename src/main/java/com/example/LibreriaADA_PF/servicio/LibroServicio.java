package com.example.LibreriaADA_PF.servicio;

import com.example.LibreriaADA_PF.entidad.Libro;

import java.util.List;

public interface LibroServicio {
    public List<Libro> listarTodosLosLibros();

    public Libro guardarLibro(Libro libro);

    public Libro obtenerLibroPorId (Long id);

    public Libro actualizarLibro(Libro libro);

    public void eliminarLibro(Libro libro);
}
