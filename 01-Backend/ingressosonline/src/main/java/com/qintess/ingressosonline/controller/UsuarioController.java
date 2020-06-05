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

import com.qintess.ingressosonline.entity.Usuario;
import com.qintess.ingressosonline.service.UsuarioService;

@Component // para indicar pro spring que Ã© um componente
@RestController // para indicar que Ã© um controller
@RequestMapping("/api")  // para indicar a url que irÃ¡ ser acessada
@CrossOrigin("http://localhost:4200")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping({"/usuario/"}) //--> aqui indica o tipo do metodo, ele serÃ¡ um Get (somente consulta)
	public ResponseEntity<List<Usuario>> findAll(){ // --> aqui vc passa como ResponseEntity, ele que farÃ¡ o retorno
		return ResponseEntity.ok().body(usuarioService.buscarTodos()); //--> aqui vc retorna um ok e no corpo (body) retorna o conteudo que vier do service
	}
	@GetMapping({"/usuario/{id}"}) //--> aqui indica o tipo do metodo, ele serÃ¡ um Get (somente consulta)
	public ResponseEntity<Object> findById(@PathVariable(name="id") Long id){ // --> aqui vc passa como ResponseEntity, ele que farÃ¡ o retorno
		return ResponseEntity.ok().body(usuarioService.buscarPorId(id)); //--> aqui vc retorna um ok e no corpo (body) retorna o conteudo que vier do service
	}
	
	@PostMapping("/usuario/") //-->cadastrar um new object
	public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
		return ResponseEntity.ok().body(usuarioService.salvar(usuario));
	}
	
	@DeleteMapping({"/usuario/{id}"}) //--> deletar um objeto
	public ResponseEntity<Usuario> delete(@PathVariable("id") Long id) {
		usuarioService.deleteId(id);
		return ResponseEntity.ok().build();
	}
	@PutMapping({"/usuario/{id}"}) //atualizar e salvar
	public void alterar (@PathVariable(name="id") Long id,
						 @RequestBody Usuario usuario) {
			usuarioService.atualizar(usuario, id);
    }
}

