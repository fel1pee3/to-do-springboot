package br.com.felipemaia.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "todos")
@Data

public class Todo {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String decricao;
    private boolean realizado;
    private int prioridade;

}
