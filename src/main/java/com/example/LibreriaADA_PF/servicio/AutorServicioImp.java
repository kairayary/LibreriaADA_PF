package com.example.LibreriaADA_PF.servicio;


import com.example.LibreriaADA_PF.entidad.Autor;
import com.example.LibreriaADA_PF.repositorio.AutorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServicioImp implements AutorServicio{
    @Autowired
    AutorRepositorio autorRepositorio;

    @Override
    public List<Autor> listarTodosLosAutores() {
        return autorRepositorio.findAll();
    }

    @Override
    public Autor guardarAutor(Autor autor) {
        return autorRepositorio.save(autor);
    }

    @Override
    public Autor obtenerAutorPorId(Long id) {
        return autorRepositorio.findById(id).get();
    }

    @Override
    public Autor actualizarAutor(Autor autor) {
        return autorRepositorio.save(autor);
    }

    @Override
    public void eliminarAutor(Autor autor) {
        autorRepositorio.delete(autor);
    }
}
