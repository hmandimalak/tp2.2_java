package tp2_2;
import java.util.*;
public class test {
	public static void main (String args[]) {
        Departement dep1 = new Departement(1);
        Departement dep2 = new Departement(2);
        
        Entreprise entreprise = new Entreprise("java_entreprise");

        Employe emp1 = new Employe(123, "selim",40000, 1);
        Employe emp2 = new Employe(456, "abir", 30000, 1);
        Employe emp3 = new Employe(789, "hadil", 22000, 1);
        
        
        entreprise.ajoutDep(dep1);
        entreprise.ajoutDep(dep2);

        dep1.ajoutEmploye(emp1);
        dep1.ajoutEmploye(emp2);
        dep1.ajoutEmploye(emp3);

        dep1.afficheDep();

        int cinToCheck = 222;
        System.out.println("L'employé avec le CIN " + cinToCheck + " existe dans le département : "
                + dep1.existeE(cinToCheck));

        dep1.retirerEmploye(emp2);

        
        dep1.afficheDep();

        
        Employe empSalMax = dep1.getEmpSalMax();
        System.out.println("L'employé avec le salaire maximum dans le département est : " + empSalMax.toString());
        
        entreprise.afficheE();
        entreprise.retirerDep(dep1);
        entreprise.afficheE();
    }
	

}
