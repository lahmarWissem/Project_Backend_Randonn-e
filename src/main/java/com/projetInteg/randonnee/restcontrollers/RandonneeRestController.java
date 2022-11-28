package com.projetInteg.randonnee.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.projetInteg.randonnee.entities.Randonnee;
import com.projetInteg.randonnee.service.RandonneeService;

@RestController
@RequestMapping("/rando")
@CrossOrigin
public class RandonneeRestController {

	@Autowired
	RandonneeService randonneeservice;

	@RequestMapping(method = RequestMethod.GET)
	public List<Randonnee> getAllRandonnes() {
		return randonneeservice.getAllRandonnees();
	}

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Randonnee getRandonneeById(@PathVariable("id") Long id) {
		return randonneeservice.getRandonnee(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Randonnee createRandonnee(@RequestBody Randonnee randonnee) {
		return randonneeservice.saveRandonnee(randonnee);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Randonnee updateRandonnee(@RequestBody Randonnee randonnee) {
		return randonneeservice.saveRandonnee(randonnee);
	}

	@RequestMapping(value = "/id", method = RequestMethod.DELETE)
	public void deleteRandonnee(@PathVariable("id") Long id) {
		randonneeservice.deleteRandonneeById(id);
	}

	@RequestMapping(value = "/randoByName/{nom}", method = RequestMethod.GET)
	public Randonnee findByNomRandonneeContains(@PathVariable("nom") String nom) {
		return randonneeservice.findByTitreRandonneeContains(nom);
	}

}
