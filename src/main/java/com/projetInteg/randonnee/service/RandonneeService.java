package com.projetInteg.randonnee.service;

import java.util.List;

import com.projetInteg.randonnee.entities.Randonnee;


public interface RandonneeService {
	Randonnee saveRandonnee(Randonnee r);

	Randonnee updateRandonnee(Randonnee r);

	void deleteRandonnee(Randonnee r);

	void deleteRandonneeById(Long id);

	Randonnee getRandonnee(Long id);

	List<Randonnee> getAllRandonnees();

	List<Randonnee> findByTitreRandonnee(String nom);

	Randonnee findByTitreRandonneeContains(String nom);
}
