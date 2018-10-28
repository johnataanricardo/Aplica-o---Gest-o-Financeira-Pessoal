package com.fean.seufinanceiro.model;

import com.fean.seufinanceiro.model.enums.Meses;
import com.fean.seufinanceiro.model.enums.TipoDespesa;

public class Despesa {

    private Long id;
    private String descricao;
    private Double valor;
    private TipoDespesa tipoDespesa;
    private String ano;
    private Meses mes;

    public Despesa() { }

    public Despesa(Long id, String descricao, Double valor, TipoDespesa tipoDespesa, String ano, Meses mes) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.tipoDespesa = tipoDespesa;
        this.ano = ano;
        this.mes = mes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Meses getMes() {
        return mes;
    }

    public void setMes(Meses mes) {
        this.mes = mes;
    }

}
