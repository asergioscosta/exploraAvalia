package com.exploraavalia.model.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "dicas")

public class Dicas {

    @ManyToOne
    private Viajante viajante;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private String destino;

    @Column
    @NotNull
    private String categorias;

    @Column
    @NotNull
    private String descricao;

    @Column
    @NotNull
    private Float custoMedioDia;

    @Column
    @NotNull
    private Integer avaliacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getCustoMedioDia() {
        return custoMedioDia;
    }

    public void setCustoMedioDia(Float custoMedioDia) {
        this.custoMedioDia = custoMedioDia;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Viajante getViajante() {
        return viajante;
    }

    public void setViajante(Viajante viajante) {
        this.viajante = viajante;
    }
}
