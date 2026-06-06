package com.example.CadastroSimples;

import com.example.CadastroSimples.Pessoas.PessoaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CadastroSimplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroSimplesApplication.class, args);
	}

}
