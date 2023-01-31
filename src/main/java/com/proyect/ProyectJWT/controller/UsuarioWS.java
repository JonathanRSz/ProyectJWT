package com.proyect.ProyectJWT.controller;

import com.proyect.ProyectJWT.dao.UsuarioRepository;
import com.proyect.ProyectJWT.dominio.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/Usuarios")
@AllArgsConstructor
public class UsuarioWS {
    private final UsuarioRepository usuarioRepository;
    @GetMapping
    public List<Usuario> listaUsuario(){
        return usuarioRepository.findAll();}
}
