package com.example.pontuada_api_rest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Nome é obrigatorio")
    private String nome;

    @NotNull(message = "E-mail é obrigatorio")
    @Email(message = "Deve ser um email valido")
    private String email;

    @NotNull(message = "CPF e obrigatorio")
    private String cpf;

    @NotNull(message = "Data de nascimento e obrigatorio")
    private String dataNascimento;

    @NotNull(message = "Salario e obrigatorio")
    private double salario;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Enumerated(EnumType.STRING)
    private Setor setor;

    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Funcionario(){
    }

    public Funcionario(Long id, String nome, String email, String cpf, String dataNascimento, double salario, Sexo sexo, Setor setor, EstadoCivil estadoCivil, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.sexo = sexo;
        this.setor = setor;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull(message = "Nome é obrigatorio") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "Nome é obrigatorio") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "E-mail é obrigatorio") @Email(message = "Deve ser um email valido") String getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "E-mail é obrigatorio") @Email(message = "Deve ser um email valido") String email) {
        this.email = email;
    }

    public @NotNull(message = "CPF e obrigatorio") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotNull(message = "CPF e obrigatorio") String cpf) {
        this.cpf = cpf;
    }

    public @NotNull(message = "Data de nascimento e obrigatorio") String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotNull(message = "Data de nascimento e obrigatorio") String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @NotNull(message = "Salario e obrigatorio")
    public double getSalario() {
        return salario;
    }

    public void setSalario(@NotNull(message = "Salario e obrigatorio") double salario) {
        this.salario = salario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salario=" + salario +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", estadoCivil=" + estadoCivil +
                ", endereco=" + endereco +
                '}';
    }
}
