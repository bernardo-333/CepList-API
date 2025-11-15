package com.bernardo.ceplistapi.dto;

import com.bernardo.ceplistapi.entity.Endereco;

public class EnderecoRequestDTO {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;

    public EnderecoRequestDTO() {
    }

    public EnderecoRequestDTO(Endereco endereco) {
        this.cep = endereco.getCep();
        this.logradouro = endereco.getLogradouro();
        this.bairro = endereco.getBairro();
        this.localidade = endereco.getLocalidade();
        this.uf = endereco.getUf();
        this.estado = endereco.getEstado();
        this.regiao = endereco.getRegiao();
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
