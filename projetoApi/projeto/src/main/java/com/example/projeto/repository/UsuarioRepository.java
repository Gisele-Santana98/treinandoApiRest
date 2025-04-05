package com.example.projeto.repository;

import com.example.projeto.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// JR chama JpaRepository, depois coloca <> com o nome da classe
// na qual a interface irá extender e seu tipo de chave primária.//
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}



