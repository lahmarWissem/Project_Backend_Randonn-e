package com.projetInteg.randonnee.reops;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetInteg.randonnee.entities.Participant;
@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {

	
	  Participant findParticipantByUsername(String username);
}
