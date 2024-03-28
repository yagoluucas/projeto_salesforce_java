package org.entities;

import java.time.LocalDateTime;

public class AtividadeDoSite extends _BaseEntities{
    private char oportunidade;
    private LocalDateTime data;
    private Suporte suporte;
    private TesteGratis testeGratis;

    public AtividadeDoSite(){}

    public AtividadeDoSite(int id, char oportunidade, LocalDateTime data, Suporte suporte, TesteGratis testeGratis) {
        super(id);
        this.oportunidade = oportunidade;
        this.data = data;
        this.suporte = suporte;
        this.testeGratis = testeGratis;
    }

    public char getOportunidade() {
        return oportunidade;
    }

    public void setOportunidade(char oportunidade) {
        this.oportunidade = oportunidade;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Suporte getSuporte() {
        return suporte;
    }

    public void setSuporte(Suporte suporte) {
        this.suporte = suporte;
    }

    public TesteGratis getTesteGratis() {
        return testeGratis;
    }

    public void setTesteGratis(TesteGratis testeGratis) {
        this.testeGratis = testeGratis;
    }

    @Override
    public String toString() {
        return "AtividadeDoSite{" +
                "oportunidade=" + oportunidade +
                ", data=" + data +
                ", suporte=" + suporte +
                ", testeGratis=" + testeGratis +
                "} " + super.toString();
    }
}
