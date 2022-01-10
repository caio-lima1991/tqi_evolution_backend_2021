package com.github.caiolima.tqi_evolution_avaliacao.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "emprestimo")
public class SolicitacaoEmprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoEmprestimo;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private double totalEmprestimo;

    @Column(nullable = false)
    private String primeiraParcela;

    @Column(nullable = false)
    private int quantParcela;
}
