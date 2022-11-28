package com.projetInteg.randonnee.reops;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.projetInteg.randonnee.entities.Guide;
@RepositoryRestResource(path = "guide")
@CrossOrigin("*") //pour autoriser react
public interface GuideRespository extends JpaRepository<Guide, Long> {
	List<Guide> findByNomGuide(String nom);
	List<Guide> findByNomGuideContains(String nom);
	
	
}
