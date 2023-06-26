package com.example.LibreriaADA_PF.servicio;


import com.example.LibreriaADA_PF.entidad.Libro;
import com.example.LibreriaADA_PF.repositorio.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LibroServicioImp implements LibroServicio {
    @Autowired
    private LibroRepositorio libroRepositorio;

    @Override
    public List<Libro> listarTodosLosLibros(){
        return libroRepositorio.findAll();
    }

    @Override
    public Libro guardarLibro(Libro libro){
        return libroRepositorio.save(libro);
    }

    @Override
    public Libro obtenerLibroPorId(Long id){
        return libroRepositorio.findById(id).get();
    }

    @Override
    public Libro actualizarLibro(Libro libro){
        return libroRepositorio.save(libro);
    }

    @Override
    public void eliminarLibro(Libro libro){
        libroRepositorio.delete(libro);
    }
}
