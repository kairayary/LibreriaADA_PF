package com.example.LibreriaADA_PF.repositorio;

import com.example.LibreriaADA_PF.entidad.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, Long> {
}
