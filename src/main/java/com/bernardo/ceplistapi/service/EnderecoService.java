package com.bernardo.ceplistapi.service;

import com.bernardo.ceplistapi.dto.EnderecoRequestDTO;
import com.bernardo.ceplistapi.dto.EnderecoResponseDTO;
import com.bernardo.ceplistapi.entity.Endereco;
import com.bernardo.ceplistapi.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    ViaCepService viaCepService;

    private final EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public EnderecoResponseDTO saveCep(String cep) {
        Endereco endereco = viaCepService.searchEndereco(cep)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado para o CEP: " + cep));
        enderecoRepository.save(endereco);
        return new EnderecoResponseDTO(endereco);
    }

    public List<EnderecoResponseDTO> listEnderecos() {
        List<Endereco> enderecos = enderecoRepository.findAll();
        List<EnderecoResponseDTO> enderecosDTO = enderecos.stream()
                .map(endereco -> new EnderecoResponseDTO(endereco)).toList();
        return enderecosDTO;
    }

    public EnderecoResponseDTO deleteEndereco(Long id) {
        Endereco endereco = enderecoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado"));
        enderecoRepository.delete(endereco);
        return new EnderecoResponseDTO(endereco);
    }

    public EnderecoResponseDTO updateEndereco(Long id, EnderecoRequestDTO novoEndereco) {
        Endereco enderecoExistente = enderecoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado"));

        if (novoEndereco.getCep() != null) {
            enderecoExistente.setCep(novoEndereco.getCep());
        }
        if (novoEndereco.getLogradouro() != null) {
            enderecoExistente.setLogradouro(novoEndereco.getLogradouro());
        }
        if (novoEndereco.getBairro() != null) {
            enderecoExistente.setBairro(novoEndereco.getBairro());
        }
        if (novoEndereco.getLocalidade() != null) {
            enderecoExistente.setLocalidade(novoEndereco.getLocalidade());
        }
        if (novoEndereco.getUf() != null) {
            enderecoExistente.setUf(novoEndereco.getUf());
        }
        if (novoEndereco.getEstado() != null) {
            enderecoExistente.setEstado(novoEndereco.getEstado());
        }
        if (novoEndereco.getRegiao() != null) {
            enderecoExistente.setRegiao(novoEndereco.getRegiao());
        }
        Endereco enderecoSalvo = enderecoRepository.save(enderecoExistente);
        return new EnderecoResponseDTO(enderecoSalvo);
    }
}




