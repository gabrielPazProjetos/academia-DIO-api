package com.academia.repository;

import com.academia.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    Matricula findByAlunoId(Long alunoId);
}
