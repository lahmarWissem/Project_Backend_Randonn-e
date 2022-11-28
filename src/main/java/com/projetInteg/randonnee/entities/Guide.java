package com.projetInteg.randonnee.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Guide {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idGuide;
	private String nomGuide;
	private String emailGuide;
	private long   TelephoneGuide;
	private Double Salaire;
	@Lob
	@Column(columnDefinition = "TEXT")
	private String image;

	
	@JsonIgnore
	@OneToMany (mappedBy = "guide")
	private List<Randonnee> randonnees;
	
	 

	
	
}

/*
 public class Guide {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idGuide;
	private String nomGuide;
	private String emailGuide;
	private long   TelephoneGuide;
	private Double Salaire;
	
	@JsonIgnore
	@OneToMany (mappedBy = "guide")
	private List<Randonnee> randonnees;
	
	 @ManyToOne
	 private Image image ;

	
	
}
*/
