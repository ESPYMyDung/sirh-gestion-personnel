package dev.sgp.filtre;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.VisiteService;
import dev.sgp.util.Constantes;

public class FrequentationFilter implements Filter
{
	private FilterConfig config = null;
	private VisiteService visitService = Constantes.VISITE_SERVICE;

	@Override
	public void init(FilterConfig config) throws ServletException
	{
		this.config = config;
		config.getServletContext().log("TimerFilter initialized");	
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chaine)
			throws IOException, ServletException
	{
	
		//filtre
		long before = System.currentTimeMillis();
		chaine.doFilter(req, resp);
		long after = System.currentTimeMillis();
		String path = ( (HttpServletRequest) req).getRequestURI();
		config.getServletContext().log(path+" : " + (after-before) );
		
		//cretion et stockage visite
		List<VisiteWeb> listeVisite = visitService.listerVisites();
		VisiteWeb visite = new VisiteWeb(path, (int) (after-before));
		listeVisite.add(visite);
	}

	@Override
	public void destroy()
	{

	}

	
}
