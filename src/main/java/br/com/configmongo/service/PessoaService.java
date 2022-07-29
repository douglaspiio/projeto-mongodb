package br.com.configmongo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.configmongo.constantes.Constantes;
import br.com.configmongo.dto.PessoaDTO;
import br.com.configmongo.model.Pessoa;
import br.com.configmongo.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	@Autowired
	private ModelMapper modelMapper;
	

	public List<PessoaDTO> buscaTodasPessoas() {
		return modelMapper.map(pessoaRepository.findAll(), new TypeToken<List<PessoaDTO>>() {
		}.getType());
	}

	public void cadastraPessoas(PessoaDTO pessoa){
			Pessoa pessoaMap = modelMapper.map(pessoa, Pessoa.class);
			pessoaMap.setNome(pessoa.getNome());
			pessoaMap.setCpf(pessoa.getCpf());
			pessoaMap.setIdade(pessoa.getIdade());
			pessoaMap.setTelefone(pessoa.getTelefone());
			pessoaMap.setIdPessoa(buscaTodasPessoas().size() + Constantes.UM);
			pessoaRepository.save(pessoaMap);
		}
}
