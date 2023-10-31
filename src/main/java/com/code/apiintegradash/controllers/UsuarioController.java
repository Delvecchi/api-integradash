package com.code.apiintegradash.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios", produces = {"application/jason"})
public class UsuarioController {

    @GetMapping
    public ResponseEntity<List<UsuarioModel>> listaUsuario() {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.findAll());
    }
}
