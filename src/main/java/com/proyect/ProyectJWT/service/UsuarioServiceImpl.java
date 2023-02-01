package com.proyect.ProyectJWT.service;


import com.proyect.ProyectJWT.model.Usuario;
import com.proyect.ProyectJWT.repository.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        log.info("Se guardo saveEmployee con exito" + usuario.toString());
        return usuarioRepository.save(usuario);
    }

    @Override
    public void delete(long id) {
        usuarioRepository.deleteById(id);
        log.info("Usuario borrado con exito " + id);
    }

    @Override
    public Usuario findById(long id) {
        Optional<Usuario> optional = usuarioRepository.findById(id);
        Usuario usuario = null;
        if (optional.isPresent()) {
            usuario = optional.get();
        } else {
            throw new RuntimeException("Usuario no encontrado por id" + id);
        }
        return usuario;
    }

    @Override
    public List<Usuario> findAll() {
        log.info("Lista de usuarios con exito ");
        return usuarioRepository.findAll();

    }
}
