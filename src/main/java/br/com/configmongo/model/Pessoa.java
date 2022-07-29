package br.com.configmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Pessoa")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

	@Id
	private String id;
	private Integer idPessoa;
	private String nome;
	private Integer idade;
	private String telefone;
	private String cpf;
}
