package com.bernardo.ceplistapi.service;

import com.bernardo.ceplistapi.entity.Endereco;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class ViaCepService {
    private final RestTemplate restTemplate = new RestTemplate();

    public Optional<Endereco> searchEndereco(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        Endereco endereco = restTemplate.getForObject(url, Endereco.class);
        return Optional.ofNullable(endereco);
    }

}
