package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@SuppressWarnings("serial")
public class CreerCollaborateurController extends HttpServlet
{
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		req.setAttribute("listeNoms", Arrays.asList("Robert", "Jean", "Hugues"));
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp")
		.forward(req, resp);
		
	}
	
	
	protected void doPost (HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		//recuperation parametre. en théorie
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String dateNaissance = req.getParameter("DdN");
		String adresse = req.getParameter("adresse");
		String numeroSS = req.getParameter("SS");
		
		//test erreur
		List<String> parametre = new ArrayList<>();
		parametre.add(nom); parametre.add(prenom);
		parametre.add(dateNaissance); parametre.add(adresse);
		parametre.add(numeroSS);
		
		List<String> erreur = new ArrayList<>();
		for (String elm:parametre)
		{
			if (elm==null || elm.isEmpty())
				erreur.add(elm);
		}
		
		if (! erreur.isEmpty() )
		{
			resp.sendError(400, "Les parametres sont incorects");
		}
		if (numeroSS.length()!=15)
		{
			resp.sendError(400, "Le numero de securite sociale est incorrect");
		}
		
		//creation du gus(tave) en java.
		Collaborateur personne = new Collaborateur(nom, prenom, LocalDate.parse(dateNaissance), adresse, numeroSS);

		//est ce que c'est legal de faire come ça?
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
		collaborateurs.add(personne);
		
	}
}
