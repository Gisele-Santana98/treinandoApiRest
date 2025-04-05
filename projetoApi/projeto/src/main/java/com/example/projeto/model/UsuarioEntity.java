package com.example.projeto.model;

import jakarta.persistence.*;
// import jakarta.persistence.Table;
// @Table(name = "tab_user") Usado quando o nome da classe não representa o nome da tabela.
@Entity
public class UsuarioEntity {
    // ORM Mapeamento Relacional de Objeto COLOCAR NO GIT
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ctrl + espaço.
    private Long id;
    @Column(nullable = false) // Equivale ao Notnull
    private String nome;
    @Column(nullable = false)
    private String email;

    public UsuarioEntity() {
    }
    public UsuarioEntity(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
