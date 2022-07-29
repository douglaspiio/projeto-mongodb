package br.com.configmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.configmongo.dto.PessoaDTO;
import br.com.configmongo.service.PessoaService;

@RestController
@RequestMapping(path = "/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	
	@GetMapping(path = "/consulta")
	public List<PessoaDTO> buscaTodasPessoas(){
		return pessoaService.buscaTodasPessoas();
	}
	
	@PostMapping(path = "/cadastra")
	public ResponseEntity<String> cadastraPessoa(@RequestBody PessoaDTO pessoa){
		try {
			pessoaService.cadastraPessoas(pessoa);
			return ResponseEntity.status(HttpStatus.CREATED).body("Pessoa cadastrada com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao cadastrar pessoa.");
		}
	}

}
