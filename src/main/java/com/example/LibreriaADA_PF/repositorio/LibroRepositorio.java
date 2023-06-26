package com.example.LibreriaADA_PF.repositorio;

import com.example.LibreriaADA_PF.entidad.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long> {
}
