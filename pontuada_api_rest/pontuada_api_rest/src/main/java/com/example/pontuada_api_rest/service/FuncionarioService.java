package com.example.pontuada_api_rest.service;

import com.example.pontuada_api_rest.exceptions.EmailJaCadastradoException;
import com.example.pontuada_api_rest.model.Funcionario;
import com.example.pontuada_api_rest.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }

    public Funcionario salvar(@Valid Funcionario funcionario){
        if(funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new EmailJaCadastradoException("email ja cadastrado.");
        }
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario atualizar(@Valid Funcionario funcionario){
        Funcionario funcionarioAtualizar = funcionarioRepository.findByEmail(funcionario.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("Funcionario nao encontrado."));

        funcionarioAtualizar.setNome(funcionario.getNome());
        funcionarioAtualizar.setEmail(funcionario.getEmail());

        return funcionarioRepository.save(funcionarioAtualizar);
    }

    public void excluir(Long id){
        Funcionario funcionarioExcluir = funcionarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Funcionario nao encontrado."));

        funcionarioRepository.delete(funcionarioExcluir);
    }
}
