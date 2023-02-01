package com.proyect.ProyectJWT.controller;

import com.proyect.ProyectJWT.repository.UsuarioRepository;
import com.proyect.ProyectJWT.model.Usuario;
import com.proyect.ProyectJWT.service.UsuarioService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/usuarios")
public class UsuarioRestController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping
    public List<Usuario> listaUsuario() {
        log.info("Lista de usuarios vista con exito");
        return usuarioService.findAll();
    }
}
