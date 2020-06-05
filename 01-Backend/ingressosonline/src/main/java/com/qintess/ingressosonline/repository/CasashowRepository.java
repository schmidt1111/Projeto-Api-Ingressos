package com.qintess.ingressosonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.CrossOrigin;

import com.qintess.ingressosonline.entity.Casashow;

//@RepositoryRestResource(collectionResourceRel="casaShow", path="casa-show")

@Repository
public interface CasashowRepository extends JpaRepository<Casashow, Long> {

}

