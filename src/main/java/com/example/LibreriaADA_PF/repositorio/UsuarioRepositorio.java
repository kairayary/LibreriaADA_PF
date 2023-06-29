package com.example.LibreriaADA_PF.repositorio;

import com.example.LibreriaADA_PF.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    public Usuario findByEmail(String email);
}
