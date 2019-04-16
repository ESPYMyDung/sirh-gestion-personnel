package dev.sgp.entite;

public class VisiteWeb
{
	//attribut
	private int id;
	private String chemin;
	private int tempsExecution;

	//constructeur
	public VisiteWeb(){}
	
	public VisiteWeb(String chemin, int tmpExe)
	{
		this.id = (int) (Math.random()*500);
		this.chemin = chemin;
		this.tempsExecution = tmpExe;
	}
	
	//getter
	public int getId()
	{
		return id;
	}
	
	public String getChemin()
	{
		return chemin;
	}
	
	public int getTempsExecution()
	{
		return tempsExecution;
	}
	
	//setter
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setChemin(String chemin)
	{
		this.chemin = chemin;
	}
	
	public void setTempsExecution(int tempsExecution)
	{
		this.tempsExecution = tempsExecution;
	}
}
