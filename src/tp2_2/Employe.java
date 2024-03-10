package tp2_2;



public class Employe implements Comparable<Employe>{
	private int cin;
    private String nom;
    private double salaire;
    private int idDep;
    
	public Employe(int cin, String nom, double salaire, int idDep) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.salaire = salaire;
		this.idDep= idDep;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public int getIdDep() {
		return idDep;
	}
	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}
	@Override
	public int compareTo(Employe E) {
		if(this.getSalaire()>E.getSalaire())
		{
			return -1;
		}
		if(this.getSalaire()<E.getSalaire())
		{
			return 1;
		}
		return 0;
	}
	
}
