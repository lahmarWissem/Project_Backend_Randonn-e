package com.projetInteg.randonnee.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetInteg.randonnee.entities.Participant;
import com.projetInteg.randonnee.entities.Randonnee;
import com.projetInteg.randonnee.reops.*;
import com.projetInteg.randonnee.service.ParticipantService;

@Transactional
@Service
public class ParticipantServiceImpl implements ParticipantService {

	@Autowired
	RandonneeRespository randonneeRepo;
	@Autowired
	ParticipantRepository participantRep;

	Boolean ok = true;

	@Override
	public Participant saveParticipant(Participant participant) {

		return participantRep.save(participant);
	}

	@Override
	public Participant findParticipantByUsername(String username) {

		return participantRep.findParticipantByUsername(username);
	}

	// get the id of user
	// get the current user randonner
	// for randonner
	// ken fama randnner fi nafs lwa9t eli m3eddi
	@Override
	public Participant addRandonneeToParticipant(String username, String titrerandonnee) {
		Participant participant = participantRep.findParticipantByUsername(username);
		Randonnee r = randonneeRepo.findByTitreRandonneeContains(titrerandonnee);

		participant.getRandonnes().forEach(rondo -> {
			if (rondo.getDateRandonnee().equals(r.getDateRandonnee())) {
				this.ok = false;
			}
		});

		if (ok) {
			participant.getRandonnes().add(r);
			return participant;
		} else {
			return participant;

		}
	}

	@Override
	public Participant updateParticipant(Participant participant) {
		// TODO Auto-generated method stub
		return participantRep.save(participant);
	}

	@Override
	public void deleteParticipantById(Long id) {
		// TODO Auto-generated method stub
		participantRep.deleteById(id);

	}

	@Override
	public Randonnee addRandonnee(Randonnee randonnee) {
		// TODO Auto-generated method stub
		return null;
	}

}
