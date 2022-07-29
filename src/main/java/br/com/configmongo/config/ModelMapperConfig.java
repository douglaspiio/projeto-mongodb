package br.com.configmongo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.configmongo.dto.PessoaDTO;
import br.com.configmongo.model.Pessoa;

@Configuration
public class ModelMapperConfig {
	
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.createTypeMap(Pessoa.class, PessoaDTO.class);
		modelMapper.validate();
		
		return modelMapper;
	}
		
}
