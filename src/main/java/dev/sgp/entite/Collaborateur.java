package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur
{
	//attribut
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String Adresse;
	private String numeroSS;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private boolean actif;
	
	//getter
	public String getMatricule() {
		return matricule;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	
	public String getAdresse() {
		return Adresse;
	}
	
	public String getNumeroSS() {
		return numeroSS;
	}
	
	public String getEmailPro() {
		return emailPro;
	}
	
	public String getPhoto() {
		return photo;
	}
	
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}
	
	public boolean isActif() {
		return actif;
	}
	
	//setter
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	
	public void setNumeroSS(String numeroSS) {
		this.numeroSS = numeroSS;
	}

	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}
	
}
