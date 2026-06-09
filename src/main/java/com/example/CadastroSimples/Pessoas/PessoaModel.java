package com.example.CadastroSimples.Pessoas;

import com.example.CadastroSimples.Hobbies.HobbiesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "pessoa_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "coluna Name")
    private String nome;

    private int idade;

    private String dataNascimento;

    // @ManyToOne uma pessoa tem apenas um hoobie
    @ManyToOne
    @JoinColumn(name = "hobbies_id") // chave estrageira
    private HobbiesModel hobbie;

}
