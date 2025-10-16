package com.academia.repository;

import com.academia.model.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {
    List<AvaliacaoFisica> findByAlunoId(Long alunoId);
}
