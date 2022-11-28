package com.projetInteg.randonnee.service;

import com.projetInteg.randonnee.entities.Participant;
import com.projetInteg.randonnee.entities.Randonnee;


public interface ParticipantService {
	
    Participant saveParticipant(Participant participant);
    Participant findParticipantByUsername (String username);
    Randonnee addRandonnee(Randonnee randonnee);
    Participant addRandonneeToParticipant(String username, String titrerandonnee);
	Participant updateParticipant(Participant participant);
	void deleteParticipantById(Long id);
    
}
