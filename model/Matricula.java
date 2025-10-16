package com.academia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @NotNull(message = "Data da matrícula é obrigatória.")
    private LocalDateTime dataDaMatricula;

    @NotEmpty(message = "Plano é obrigatório.")
    private String plano;

    @NotEmpty(message = "Status é obrigatório.")
    private String status;

    @Size(max = 300, message = "Observações devem ter no máximo 300 caracteres.")
    private String observacoes;
}
