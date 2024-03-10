package tp2_2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Departement{
	private int idDep;
    private Set<Employe> LEmployes;
    
	public int getIdDep() {
		return idDep;
	}
	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}
	public Departement(int idDep) {
		super();
		this.idDep = idDep;
		this.LEmployes = new HashSet<>();
		
	}
	public void ajoutEmploye(Employe E) {
		if (E.getCin() > 0) {
            LEmployes.add(E);
        }
       
    }
	public void retirerEmploye(Employe E)
	{
		LEmployes.remove(E);
	}
	public void afficheDep()
	{
		System.out.println("Département ID: " + idDep);
        for (Employe e : LEmployes) {
            System.out.println("nom "+e.getNom() + " cin " + e.getCin() + "  Salaire" + e.getSalaire());
        }
	}
	public boolean existeE(int cin)
	{
		 for (Employe E : LEmployes) {
	            if (E.getCin() == cin) {
	                return true;
	            }
	}
		return false;
	}
	
	public Employe getEmpSalMax()
	{
		TreeSet<Employe>l=new TreeSet<>(LEmployes);
		return l.first();
		
	}
	

	

}
