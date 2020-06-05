package com.qintess.ingressosonline.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qintess.ingressosonline.entity.Casashow;
import com.qintess.ingressosonline.exception.IngressoException;
import com.qintess.ingressosonline.repository.CasashowRepository;

@Service
public class CasashowService {
	
	@Autowired
	private CasashowRepository repository;
	
	public CasashowService(CasashowRepository repository) {
		this.repository = repository;
	}
	public Casashow salvar(Casashow casashow) {
		return repository.save(casashow);
	}
	public List<Casashow> buscarTodos() {
		return repository.findAll();
	}
	public Casashow delete(Casashow casaShow) {
		repository.delete(casaShow);
		return casaShow;
	}
	public Object buscarPorId (Long id) {
		return repository.findById(id);
	}
	public void deleteId(Long id) {
		repository.deleteById(id);
	}
	public Casashow atualizar(Casashow casaShow, Long id) {
		Casashow atualizar = repository.findById(id).orElseThrow(() -> new IngressoException("Usuario não localizado."));
		atualizar.setNome(casaShow.getNome());
		atualizar.setEndereco(casaShow.getEndereco());
		atualizar.setTelefone(casaShow.getTelefone());
		atualizar.setCep(casaShow.getCep());
		atualizar.setCidade(casaShow.getCidade());
		atualizar.setEstado(casaShow.getEstado());
		
		return repository.save(atualizar);
	}	
}

	
	