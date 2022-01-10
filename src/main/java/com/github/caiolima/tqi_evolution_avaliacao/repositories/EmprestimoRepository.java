package com.github.caiolima.tqi_evolution_avaliacao.repositories;

import com.github.caiolima.tqi_evolution_avaliacao.entities.SolicitacaoEmprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<SolicitacaoEmprestimo, Long> {
}
