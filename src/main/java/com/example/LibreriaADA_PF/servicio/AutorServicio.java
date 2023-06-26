package com.example.LibreriaADA_PF.servicio;

import com.example.LibreriaADA_PF.entidad.Autor;

import java.util.List;

public interface AutorServicio {
    public List<Autor> listarTodosLosAutores();

    public Autor guardarAutor(Autor autor);

    public Autor obtenerAutorPorId (Long id);

    public Autor actualizarAutor(Autor autor);

    public void eliminarAutor(Autor autor);
}
