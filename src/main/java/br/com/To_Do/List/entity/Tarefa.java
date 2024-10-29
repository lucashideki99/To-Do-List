package br.com.To_Do.List.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column(length = 500)
    private String description;

    @Column(name = "dataCriacao", nullable = false, updatable = false)
    private LocalDate dataCriacao;

    @Column(name = "dataFinalizacao")
    private LocalDate dataFinalizacao;

    @Enumerated(EnumType.STRING)
    private TarefaStatus status;

    @Enumerated(EnumType.STRING)
    private TarefaPriority priority;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categoria categoria;
}
