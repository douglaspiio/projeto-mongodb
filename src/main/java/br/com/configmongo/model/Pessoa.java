package br.com.configmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produto")
public class Pessoa {

	@Id
	Long idProduto;
}
