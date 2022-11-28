package com.projetInteg.randonnee.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;



import lombok.Data;


@Data
@Entity
public class Participant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParticipant;
	@Column(unique = true)
	private String username;
	private String password;
	private Long   NumTelUser;
	private String EmailUser;
	private Long   nbPlaceParticiper;
	private Double prixTotal; 
	private Integer Etat;
	
	@Lob
	@Column(columnDefinition = "TEXT")
	private String image;
	
	   @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
		@JoinTable(name="participant_rando",joinColumns = @JoinColumn(name="idParticipant") , 
				   inverseJoinColumns = @JoinColumn(name="idRandonnee")) 
		private List<Randonnee> randonnes;

	public Long getIdParticipant() {
		return idParticipant;
	}

	public void setIdParticipant(Long idParticipant) {
		this.idParticipant = idParticipant;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getNumTelUser() {
		return NumTelUser;
	}

	public void setNumTelUser(Long numTelUser) {
		NumTelUser = numTelUser;
	}

	public String getEmailUser() {
		return EmailUser;
	}

	public void setEmailUser(String emailUser) {
		EmailUser = emailUser;
	}

	public Long getNbPlaceParticiper() {
		return nbPlaceParticiper;
	}

	public void setNbPlaceParticiper(Long nbPlaceParticiper) {
		this.nbPlaceParticiper = nbPlaceParticiper;
	}

	public Double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(Double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Integer getEtat() {
		return Etat;
	}

	public void setEtat(Integer etat) {
		Etat = etat;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Randonnee> getRandonnes() {
		return randonnes;
	}

	public void setRandonnes(List<Randonnee> randonnes) {
		this.randonnes = randonnes;
	}

	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Participant(Long idParticipant, String username, String password, Long numTelUser, String emailUser,
			Long nbPlaceParticiper, Double prixTotal, Integer etat, String image, List<Randonnee> randonnes) {
		super();
		this.idParticipant = idParticipant;
		this.username = username;
		this.password = password;
		NumTelUser = numTelUser;
		EmailUser = emailUser;
		this.nbPlaceParticiper = nbPlaceParticiper;
		this.prixTotal = prixTotal;
		Etat = etat;
		this.image = image;
		this.randonnes = randonnes;
	}

	@Override
	public String toString() {
		return "Participant [idParticipant=" + idParticipant + ", username=" + username + ", password=" + password
				+ ", NumTelUser=" + NumTelUser + ", EmailUser=" + EmailUser + ", nbPlaceParticiper=" + nbPlaceParticiper
				+ ", prixTotal=" + prixTotal + ", Etat=" + Etat + ", image=" + image + ", randonnes=" + randonnes + "]";
	}

	
	   



	

}
