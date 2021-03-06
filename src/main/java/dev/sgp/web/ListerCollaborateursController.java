package dev.sgp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
//import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.CollaborateurService;
//import dev.sgp.service.VisiteService;
import dev.sgp.util.Constantes;

@SuppressWarnings("serial")
public class ListerCollaborateursController extends HttpServlet
{
	// recuperation du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		//List<VisiteWeb> listeVisite = visitService.listerVisites();

		// utilisation du service
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
		req.setAttribute("collaborateurs", collaborateurs);
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
		.forward(req, resp);

	
	}
	
}
