package com.qintess.ingressosonline.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.ingressosonline.entity.Compra;
import com.qintess.ingressosonline.service.CompraService;

@Component // para indicar pro spring que Ã© um componente
@RestController // para indicar que Ã© um controller
@RequestMapping("/api")  // para indicar a url que irÃ¡ ser acessada
@CrossOrigin("http://localhost:4200")
public class CompraController {
	@Autowired
	private CompraService compraService;
	
	@GetMapping({"/compra/"}) //--> aqui indica o tipo do metodo, ele serÃ¡ um Get (somente consulta)
	public ResponseEntity<List<Compra>> findAll(){ // --> aqui vc passa como ResponseEntity, ele que farÃ¡ o retorno
		return ResponseEntity.ok().body(compraService.buscarTodos()); //--> aqui vc retorna um ok e no corpo (body) retorna o conteudo que vier do service
	}
	@GetMapping({"/compra/{id}"}) //--> aqui indica o tipo do metodo, ele serÃ¡ um Get (somente consulta)
	public ResponseEntity<Object> findById(@PathVariable(name="id") Long id){ // --> aqui vc passa como ResponseEntity, ele que farÃ¡ o retorno
		return ResponseEntity.ok().body(compraService.buscarPorId(id)); //--> aqui vc retorna um ok e no corpo (body) retorna o conteudo que vier do service
	}
	
	@PostMapping("/compra/") //-->cadastrar um new object
	public ResponseEntity<String> create(@RequestBody Compra compra) {
		return ResponseEntity.ok().body(compraService.analisarCompra(compra));
	}
	
	@DeleteMapping({"/compra/{id}"}) //--> deletar um objeto
	public ResponseEntity<Compra> delete(@PathVariable("id") Long id) {
		 compraService.deleteId(id);
		return ResponseEntity.ok().build();
	}
	@PutMapping({"/compra/{id}"}) //alterar e salvar
	public void alterar (@PathVariable(name="id") Long id,
						 @RequestBody Compra compra) {
			compraService.atualizar(compra, id);
    }
}
