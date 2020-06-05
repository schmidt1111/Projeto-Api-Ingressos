package com.qintess.ingressosonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qintess.ingressosonline.entity.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long>{

}
