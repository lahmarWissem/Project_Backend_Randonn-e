package com.projetInteg.randonnee.entities;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.Data;



@Data
@Entity
public class Randonnee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRandonnee;
	private Double prixRandonnee;
	private String titreRandonnee;
	private String description;
	private Date dateRandonnee;
	private Time dateDebut;
	private Time dateFin;
	private String destination;
	private long nbPlace;
	@Lob
	@Column(columnDefinition = "TEXT")
	private String image;

	@ManyToOne
	private Guide guide;
	
	
	
	 
	    @JsonIgnore
	    @ManyToMany(mappedBy = "randonnes")
	    private List<Participant> participants ;


		public long getIdRandonnee() {
			return idRandonnee;
		}


		public void setIdRandonnee(long idRandonnee) {
			this.idRandonnee = idRandonnee;
		}


		public Double getPrixRandonnee() {
			return prixRandonnee;
		}


		public void setPrixRandonnee(Double prixRandonnee) {
			this.prixRandonnee = prixRandonnee;
		}


		public String getTitreRandonnee() {
			return titreRandonnee;
		}


		public void setTitreRandonnee(String titreRandonnee) {
			this.titreRandonnee = titreRandonnee;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public Date getDateRandonnee() {
			return dateRandonnee;
		}


		public void setDateRandonnee(Date dateRandonnee) {
			this.dateRandonnee = dateRandonnee;
		}


		public Time getDateDebut() {
			return dateDebut;
		}


		public void setDateDebut(Time dateDebut) {
			this.dateDebut = dateDebut;
		}


		public Time getDateFin() {
			return dateFin;
		}


		public void setDateFin(Time dateFin) {
			this.dateFin = dateFin;
		}


		public String getDestination() {
			return destination;
		}


		public void setDestination(String destination) {
			this.destination = destination;
		}


		public long getNbPlace() {
			return nbPlace;
		}


		public void setNbPlace(long nbPlace) {
			this.nbPlace = nbPlace;
		}


		public String getImage() {
			return image;
		}


		public void setImage(String image) {
			this.image = image;
		}


		public Guide getGuide() {
			return guide;
		}


		public void setGuide(Guide guide) {
			this.guide = guide;
		}


		public List<Participant> getParticipants() {
			return participants;
		}


		public void setParticipants(List<Participant> participants) {
			this.participants = participants;
		}


		public Randonnee() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Randonnee(long idRandonnee, Double prixRandonnee, String titreRandonnee, String description,
				Date dateRandonnee, Time dateDebut, Time dateFin, String destination, long nbPlace, String image,
				Guide guide, List<Participant> participants) {
			super();
			this.idRandonnee = idRandonnee;
			this.prixRandonnee = prixRandonnee;
			this.titreRandonnee = titreRandonnee;
			this.description = description;
			this.dateRandonnee = dateRandonnee;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.destination = destination;
			this.nbPlace = nbPlace;
			this.image = image;
			this.guide = guide;
			this.participants = participants;
		}


		@Override
		public String toString() {
			return "Randonnee [idRandonnee=" + idRandonnee + ", prixRandonnee=" + prixRandonnee + ", titreRandonnee="
					+ titreRandonnee + ", description=" + description + ", dateRandonnee=" + dateRandonnee
					+ ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", destination=" + destination
					+ ", nbPlace=" + nbPlace + ", image=" + image + ", guide=" + guide + ", participants="
					+ participants + "]";
		}





	
	
	

	
	
	
	
	
	
	
	
	


}
