package com.projetInteg.randonnee.reops;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetInteg.randonnee.entities.Randonnee;
@Repository
public interface RandonneeRespository extends JpaRepository<Randonnee, Long> {
	List<Randonnee> findByTitreRandonnee(String nom);
	 Randonnee findByTitreRandonneeContains(String nom);
	// Randonnee findRandonneeByTitreRandonnee(String nom);
	
	
	
}
