package br.com.configmongo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {
	
	private String nome;
	private Integer idade;
	private String telefone;
	private String cpf;

}
