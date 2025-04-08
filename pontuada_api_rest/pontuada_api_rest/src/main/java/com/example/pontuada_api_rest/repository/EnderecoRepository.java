package com.example.pontuada_api_rest.repository;

import com.example.pontuada_api_rest.model.Endereco;
import com.example.pontuada_api_rest.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
