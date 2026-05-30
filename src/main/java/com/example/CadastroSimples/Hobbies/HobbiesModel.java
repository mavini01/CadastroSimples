package com.example.CadastroSimples.Hobbies;

import com.example.CadastroSimples.Pessoas.PessoaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_hobbies")
public class HobbiesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String hobbie;
    private PessoaModel pessoa;

    @OneToMany(mappedBy = "hobbie") // um hobbie pode ter varias pessoas
    private List<PessoaModel> pessoas;

    public HobbiesModel() {
    }

    public HobbiesModel(String hobbie, PessoaModel pessoa) {
        this.hobbie = hobbie;
        this.pessoa = pessoa;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public PessoaModel getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaModel pessoa) {
        this.pessoa = pessoa;
    }
}
