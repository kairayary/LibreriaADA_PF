package com.example.LibreriaADA_PF.servicio;

import com.example.LibreriaADA_PF.dto.UsuarioRegistroDTO;
import com.example.LibreriaADA_PF.entidad.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;
public interface UsuarioServicio  extends UserDetailsService{
    public Usuario guardar(UsuarioRegistroDTO registroDTO);
}
