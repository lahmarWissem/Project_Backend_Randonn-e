package com.projetInteg.randonnee.restcontrollers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetInteg.randonnee.entities.Participant;
import com.projetInteg.randonnee.reops.ParticipantRepository;
import com.projetInteg.randonnee.reops.RandonneeRespository;
import com.projetInteg.randonnee.service.ParticipantService;
import com.projetInteg.randonnee.service.RandonneeService;

@RestController
@RequestMapping("/particip")
@CrossOrigin
public class participantRestController {

	@Autowired
	RandonneeService randonneeservice;

	@Autowired
	ParticipantService participantservice;
	@Autowired
	RandonneeRespository randonneeRepo;
	@Autowired
	ParticipantRepository participantRep;

	@RequestMapping(method = RequestMethod.GET)
	public List<Participant> getAllParticipants() {
		return participantRep.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public Participant createParticipant(@RequestBody Participant participant) {
		return participantRep.save(participant);
	}

	// hedhy taatiha luser name wl titre mtaa rando tzidhom f table intermidiare
	// tzid participant lel randonner lfleniaa
	//hne ken thebou tzidou nombre de place ena kolt sayeb aalina ken thebou aamlouha fi fonction wahadha wkhw 
	@RequestMapping(path = "add", method = RequestMethod.POST)
	public Participant addNewParticipantToDataBase(@RequestBody Map<String, Object> payload) throws Exception {
		// System.out.println((String) payload.get("titreRandonnee"));
		// return null;
		return participantservice.addRandonneeToParticipant((String) payload.get("username"),
				(String) payload.get("titreRandonnee"));
	}

	// hedhy delete 3adeya
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteParticipant(@PathVariable("id") Long id) {
		participantservice.deleteParticipantById(id);
	}

	// hedhy tbadal letat mtaa lparticipant kenha 1 maaneha raw accepter ken 0 mazel
	// ma te9belsh
	@RequestMapping(method = RequestMethod.PUT)
	public Participant AccepterParticipation(@RequestBody Participant participant) throws Exception {
		return participantservice.updateParticipant(participant);
	}

}
