package com.bernardo.ceplistapi.controller;

import com.bernardo.ceplistapi.dto.EnderecoRequestDTO;
import com.bernardo.ceplistapi.service.EnderecoService;
import com.bernardo.ceplistapi.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;
    @Autowired
    ViaCepService viaCepService;

    @GetMapping("/{cep}")
    public ResponseEntity<?> searchCep(@PathVariable String cep) {
        return ResponseEntity.ok(viaCepService.searchEndereco(cep).get());
    }

    @PostMapping("/{cep}")
    public ResponseEntity<?> saveAdress(@PathVariable String cep) {
        return ResponseEntity.ok(enderecoService.saveCep(cep));
    }

    @GetMapping
    public ResponseEntity<?> listAdress() {
        return ResponseEntity.ok(enderecoService.listEnderecos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAdress(@PathVariable Long id) {
        return ResponseEntity.ok(enderecoService.deleteEndereco(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateAdress(@PathVariable Long id, @RequestBody EnderecoRequestDTO enderecoDTO) {
        return ResponseEntity.ok(enderecoService.updateEndereco(id, enderecoDTO));
    }
}
