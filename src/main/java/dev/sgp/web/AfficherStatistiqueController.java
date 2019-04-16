package dev.sgp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.VisiteService;
import dev.sgp.util.Constantes;

public class AfficherStatistiqueController extends HttpServlet
{
	private VisiteService visitService = Constantes.VISITE_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{

		// utilisation du service
		List<VisiteWeb> listeVisite = visitService.listerVisites();
		req.setAttribute("visites", listeVisite);
		req.getRequestDispatcher("/WEB-INF/views/collab/afficherStats.jsp")
		.forward(req, resp);

	
	}
}
