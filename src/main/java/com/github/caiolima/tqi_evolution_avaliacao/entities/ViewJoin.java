package com.github.caiolima.tqi_evolution_avaliacao.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ViewJoin implements java.io.Serializable{

    private int codigoEmprestimo;
    private double totalEmprestimo;
    private int quantParcelas;
    private String primeiraParcela;
    private String email;
    private double renda;

    public ViewJoin(int codigoEmprestimo, double valor, int quantParcelas, String primeiroPagamento, String email, double renda){
        this.codigoEmprestimo = codigoEmprestimo;
        this.totalEmprestimo = totalEmprestimo;
        this.quantParcelas = quantParcelas;
        this.primeiraParcela = primeiraParcela;
        this.email = email;
        this.renda = renda;
    }

    public ViewJoin(){}
}
