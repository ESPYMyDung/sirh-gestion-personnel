package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class EditerCollaborateurController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{

		// recupere la valeur d'un parametre dont le nom est matricule
		String matricule = req.getParameter("matricule");

		if (matricule==null) //.isEmpty() -> ne marche que si on met ..matricule=
		{ resp.sendError(400, "un matricule est attendu");}
		else
		{
		resp.getWriter().write("<h1>Edition de collaborateur</h1>"
		+ "Matricule : " + matricule);
		}

	}
	
	protected void doPost (HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		/*
		List<String> parametre = new ArrayList<>();
		parametre.add(matricule); parametre.add(titre); 
		parametre.add(nom); parametre.add(prenom);
		
		List<String> erreur = new ArrayList<>();
		for (String elm:parametre)
		{
			if (elm==null || elm.isEmpty())
				erreur.add(elm);
		}
		
		if (! erreur.isEmpty() )
		{
			resp.sendError(400, "Les parametres suivant sont incorects : "
					for (String elm:erreur)
					{ + elm }
					);
		}*/
		
		/*cette partie peut etre automatise afin de pouvoir avoir un code evolutif : 
		* en gros on met tout dans une liste et on teste sur chaque element de la liste
		* avantage, si on est amene a ajouter un element plus tard, son test est automatise
		*/
		if (matricule==null || matricule.isEmpty()) // || titre==null || nom==null || prenom==null
		{ resp.sendError(400, "Les parametres suivant sont incorects : matricule");}
		else if (titre==null || titre.isEmpty())
		{ resp.sendError(400, "Les parametres suivant sont incorects : titre");}
		else if (nom==null || nom.isEmpty())
		{ resp.sendError(400, "Les parametres suivant sont incorects : nom");}
		else if (prenom==null || prenom.isEmpty())
		{ resp.sendError(400, "Les parametres suivant sont incorects : prenom");}
		else
		{
			resp.setStatus(201);
			resp.getWriter().write("<h1>Edition de collaborateur</h1>"
					+ "Creation d'un collaborateur avec les informations suivantes : "
					+ "Matricule : " + matricule
					+ ", Titre : " + titre
					+ ", Nom : " + nom
					+ ", Prenom : " + prenom);
					
		}
	}
	
}
