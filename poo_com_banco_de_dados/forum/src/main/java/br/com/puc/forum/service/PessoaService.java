package br.com.puc.forum.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.puc.forum.dto.PessoaDto;
import br.com.puc.forum.exception.PessoaException;
import br.com.puc.forum.model.Pessoa;
import br.com.puc.forum.repository.PessoaRepository;

@Service
public class PessoaService {

	private PessoaRepository pessoaRepository;
	
	@Autowired
	public PessoaService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}
	
	public Pessoa criaPessoa(PessoaDto pessoaDto) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setCpf(pessoaDto.getCpf());
		pessoa.setEmail(pessoaDto.getEmail());
		pessoa.setNome(pessoaDto.getNome());
		pessoa.setTelefone(pessoaDto.getTelefone());
		
		return pessoaRepository.save(pessoa);
	}
	
	public Pessoa atualizarPessoa(PessoaDto pessoaDto) throws PessoaException {
		Optional<Pessoa> pessoaAtualizarOpt = pessoaRepository.findByCpf(pessoaDto.getCpf());
		
		if(pessoaAtualizarOpt.isPresent()) {
			Pessoa pessoa = pessoaAtualizarOpt.get();
			pessoa.setEmail(pessoaDto.getEmail());
			pessoa.setTelefone(pessoaDto.getTelefone());
			
			return pessoaRepository.save(pessoa);
		}
		
		throw new PessoaException("Pessoa não encontrada com este CPF");
		
	}
	
	public Long deletaPessoa(String cpf) throws PessoaException {
		Optional<Pessoa> pessoaDeletarOpt = pessoaRepository.findByCpf(cpf);
		
		if(pessoaDeletarOpt.isPresent()) {
			Long idDeletado = pessoaDeletarOpt.get().getId();
			pessoaRepository.delete(pessoaDeletarOpt.get());
			
			return idDeletado;
		}
		
		throw new PessoaException("Pessoa não encontrada com este CPF");
	}
	
	public List<Pessoa> getAllPessoa(){
		return pessoaRepository.findAll();
	}
	
	public Pessoa getPessoaByCpf(String cpf) throws PessoaException {
		Optional<Pessoa> pessoaOpt = pessoaRepository.findByCpf(cpf);
		
		if(pessoaOpt.isPresent()) {
			return pessoaOpt.get();
		}
		
		throw new PessoaException("Pessoa não encontrada com este CPF");
	}
	
	
}
