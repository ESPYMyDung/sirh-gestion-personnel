package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;

public class CollaborateurService
{
	//attribut
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();

	//getter
	public List<Collaborateur> listerCollaborateurs()
	{
		return listeCollaborateurs;
	}

	//setter
	public void sauvegarderCollaborateur(Collaborateur collab)
	{
		listeCollaborateurs.add(collab);
	}
}
