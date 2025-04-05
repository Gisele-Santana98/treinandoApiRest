package com.example.projeto.controller;

import com.example.projeto.model.UsuarioEntity;
import com.example.projeto.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioRepository usuarioRepository;
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    @GetMapping
    public List<UsuarioEntity> ListarTodos(){
        return usuarioRepository.findAll(); // findAll faz um SELECT e busca todos os usuários no banco.
    }
    //Resposta a requisição de Get.
    @PostMapping
    public ResponseEntity<UsuarioEntity> salvar(@RequestBody UsuarioEntity usuario){
        usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    //@PutMapping

    //@DeleteMapping
}
