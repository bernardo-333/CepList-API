package com.bernardo.ceplistapi.dto;

import com.bernardo.ceplistapi.entity.Endereco;

public class EnderecoResponseDTO {
    private long id;
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;

    public EnderecoResponseDTO(Endereco endereco) {
        this.id = endereco.getId();
        this.cep = endereco.getCep();
        this.logradouro = endereco.getLogradouro();
        this.bairro = endereco.getBairro();
        this.localidade = endereco.getLocalidade();
        this.uf = endereco.getUf();
        this.estado = endereco.getEstado();
        this.regiao = endereco.getRegiao();
    }

    public long getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }
}
