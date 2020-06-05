package com.qintess.ingressosonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.qintess.ingressosonline.entity.Usuario;
@CrossOrigin("http://localhost:4200")
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
