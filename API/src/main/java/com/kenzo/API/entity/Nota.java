package com.kenzo.API.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // representa uma tabela no banco de dados
@Table(name = "Notas") // nome da tabela 

public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Titulo", nullable = false)
    private String titulo;

    @Column(name = "Descricao", nullable = false)
    private String descricao;

    @Column(name = "Importancia", nullable = false)
    private int importancia;

    public Nota() {}

    public Nota(String titulo, String descricao, int importancia){
        this.titulo = titulo;
        this.descricao = descricao;
        this.importancia = importancia;
    }

    public Long getId(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }


    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getImportancia(){
        return importancia;
    }

    public void setImportancia(int importancia){
        this.importancia = importancia;
    }
}
