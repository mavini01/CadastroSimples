package com.example.CadastroSimples;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoa_cadastro")
public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private int dataNascimento;

    public PessoaModel() {
    }

    public PessoaModel(int dataNascimento, int idade, String nome) {
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
