package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.VisiteWeb;

public class VisiteService
{
	//attribut
		List<VisiteWeb> listeVisites = new ArrayList<>();
		
		List<VisiteWeb> listeLister = new ArrayList<>();
		List<VisiteWeb> listeCreer = new ArrayList<>();
		List<VisiteWeb> listeEditer = new ArrayList<>();
		
		List<StatVisite> listeStat = new ArrayList<>();

		//getter
		public List<VisiteWeb> listerVisites()
		{
			return listeVisites;
		}

		//setter
		public void sauvegarderVisite(VisiteWeb visite)
		{
			listeVisites.add(visite);
		}
		
		public void statVisite()
		{
			int cCreer = 0; int cLister = 0; int cEditer = 0;
			int sCreer = 0; int sLister = 0; int sEditer = 0;
			
			
			for(VisiteWeb vist:listeVisites)
			{
				if (vist.getChemin().equals("/collaborateurs/creer"))
				{
					cCreer++;
					sCreer += vist.getTempsExecution();
				}
				
				if (vist.getChemin().equals("/collaborateurs/lister"))
				{
					cLister++;
				}
				
				if (vist.getChemin().equals("/collaborateurs/editer"))
				{
					cEditer++;
				}
			}
			
			
		}
}

class StatVisite
{
	String path;
	int nombre;
	int mimi;
	int maxi;
	int moyenne;

}
