package com.example.CadastroSimples.Pessoas;

import com.example.CadastroSimples.Hobbies.HobbiesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pessoa_cadastro")
public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String dataNascimento;
    // @ManyToOne uma pessoa tem apenas um hoobie
    @ManyToOne
    @JoinColumn(name = "hobbies_id") // chave estrageira
    private HobbiesModel hobbie;
    private List<HobbiesModel> hobbies;
    public PessoaModel() {
    }

    public PessoaModel(String dataNascimento, int idade, String nome) {
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

    public String getDataNascimento() {
        return dataNascimento;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
