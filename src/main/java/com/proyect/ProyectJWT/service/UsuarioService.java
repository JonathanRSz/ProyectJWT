package com.proyect.ProyectJWT.service;

import com.proyect.ProyectJWT.model.Usuario;

import java.util.List;

public interface UsuarioService {

    public Usuario saveUsuario(Usuario usuario);
    public void delete(long id);
    public Usuario findById(long id);
    public List<Usuario> findAll();
}
