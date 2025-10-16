package com.academia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Preencha o nome corretamente.")
    @Size(min = 3, max = 100, message = "${validatedValue} precisa estar entre {min} e {max} caracteres.")
    private String nome;

    @NotEmpty(message = "Preencha o email corretamente.")
    @Email(message = "${validatedValue} é inválido.")
    private String email;

    @NotEmpty(message = "Preencha o CPF corretamente.")
    @Pattern(regexp = "\\d{11}", message = "CPF deve conter 11 dígitos.")
    private String cpf;

    @NotEmpty(message = "Preencha o bairro corretamente.")
    @Size(min = 3, max = 100)
    private String bairro;

    @NotEmpty(message = "Preencha o endereço corretamente.")
    private String endereco;

    @NotEmpty(message = "Preencha o telefone corretamente.")
    @Pattern(regexp = "\\d{10,11}", message = "Telefone deve conter 10 ou 11 dígitos.")
    private String telefone;

    @Past(message = "Data de nascimento inválida.")
    @NotNull
    private LocalDate dataNascimento;

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<AvaliacaoFisica> avaliacoes;

    @OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
    private Matricula matricula;
}
