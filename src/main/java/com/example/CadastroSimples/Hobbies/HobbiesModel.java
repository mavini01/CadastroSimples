package com.example.CadastroSimples.Hobbies;

import com.example.CadastroSimples.Pessoas.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_hobbies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HobbiesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String hobbie;

    @OneToMany(mappedBy = "hobbie") // um hobbie pode ter varias pessoas
    private List<PessoaModel> pessoas;

}
