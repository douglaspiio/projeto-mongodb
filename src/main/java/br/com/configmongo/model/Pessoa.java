package br.com.configmongo.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "produto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

	@Id
	private Long idProduto;
	private String nome;
	private BigDecimal preco;
}
