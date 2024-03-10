package tp2_2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Entreprise {
    private String nomEntreprise;
    private HashMap<Integer, Departement> Liste_Deps;

    public Entreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
        this.Liste_Deps = new HashMap<>();
    }

    public void ajoutDep(Departement d) {
        Liste_Deps.put(d.getIdDep(), d);
    }

    public void retirerDep(Departement d) {
        Liste_Deps.remove(d.getIdDep());
    }

    public void afficheE() {
        System.out.println("Nom de l'entreprise : " + nomEntreprise);
        Set<Entry<Integer, Departement>> s = this.Liste_Deps.entrySet();
        for (Entry<Integer, Departement> e : s) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }

    public void UpdateDep(Employe E, int idDep) {
        Collection<Departement> l = Liste_Deps.values();
        Departement depcurrent = null;
        for (Departement d : l) {
            if (d.existeE(E.getCin())) {
                depcurrent = d;
                break;
            }
        }
        if (depcurrent != null) {
            depcurrent.retirerEmploye(E);
            Departement newDep = Liste_Deps.get(idDep);
            if (newDep != null) {
                newDep.ajoutEmploye(E);
            } else {
                System.out.println(" n'existe pas.");
            }
        } else {
            System.out.println(" n'existe pas dans aucun département.");
        }
    }

    public boolean existeD(Departement d) {
        return Liste_Deps.containsValue(d);
    }
}
