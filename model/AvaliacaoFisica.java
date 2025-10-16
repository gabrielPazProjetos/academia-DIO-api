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
public class AvaliacaoFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @NotNull(message = "Data da avaliação é obrigatória.")
    private LocalDateTime dataDaAvaliacao;

    @Positive(message = "Peso deve ser positivo.")
    private double peso;

    @Positive(message = "Altura deve ser positiva.")
    private double altura;

    @PositiveOrZero(message = "IMC não pode ser negativo.")
    private double imc;

    @Size(max = 500, message = "Observações devem ter no máximo 500 caracteres.")
    private String observacoes;
}
