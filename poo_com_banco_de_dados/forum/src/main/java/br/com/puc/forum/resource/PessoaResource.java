package br.com.puc.forum.resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.puc.forum.dto.PessoaDto;
import br.com.puc.forum.exception.PessoaException;
import br.com.puc.forum.model.Pessoa;
import br.com.puc.forum.service.PessoaService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/pessoa")
public class PessoaResource {

	private PessoaService pessoaService;

	@Autowired
	public PessoaResource(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}

	@PostMapping("/new")
	@ApiOperation(value = "Endpoint para salvar nova pessoa", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pessoa> criaPessoa(@RequestBody PessoaDto pessoaDto) {
		Pessoa novaPessoa = pessoaService.criaPessoa(pessoaDto);

		return ResponseEntity.ok().body(novaPessoa);
	}

	@PostMapping("/update")
	@ApiOperation(value = "Endpoint para atualização de uma pessoa já cadastrada", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> atualizaPessoa(@RequestBody PessoaDto pessoaDto) {

		try {
			Pessoa pessoaAtualizada = pessoaService.atualizarPessoa(pessoaDto);
			return ResponseEntity.ok().body(pessoaAtualizada);

		} catch (PessoaException ex) {

			return ResponseEntity.notFound().build();
		}

	}
	
	@DeleteMapping("/{cpf}")
	@ApiOperation(value = "Endpoint para exclusão pelo CPF, de pessoa já cadastrada", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> deletaPessoaa(@PathVariable(name = "cpf") String cpf){
		try {
			Long idDeletado = pessoaService.deletaPessoa(cpf);
			
			Map<String, Long> resp = new HashMap<String, Long>();
			resp.put("Pessoa deletada", idDeletado);
			return ResponseEntity.ok().body(resp);

		} catch (PessoaException ex) {

			return ResponseEntity.notFound().build();
		}
		
	}
	
	@GetMapping("/{cpf}")
	@ApiOperation(value = "Endpoint de busca por pesso através do CPF", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pessoa> getPessoa(@PathVariable(name = "cpf") String cpf){
		try {
			Pessoa pessoa = pessoaService.getPessoaByCpf(cpf);
			
			return ResponseEntity.ok().body(pessoa);
		} catch (PessoaException ex) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/all")
	@ApiOperation(value = "Endpoint de busca por todas as pessoas já cadastradas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Pessoa>> getAllPessoa(){
		try {
			List<Pessoa> allPessoa = pessoaService.getAllPessoa();
			
			return ResponseEntity.ok().body(allPessoa);
		}catch(Exception ex) {
			return ResponseEntity.notFound().build();
		}
	}
	
	

}
