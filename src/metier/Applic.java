package metier;

import domaine.WorkStation;
import domaine.WorkStationType;
import factory.Company;

public class Applic {
    private Company c;

    public Applic(Company c) {
        this.c = c;
    }

    public void majDeToutesLesStations() {
        for (String[] data : dao.Bdd.getListWorkStations()) {
            WorkStationType t = data[0].equalsIgnoreCase("windows") ? WorkStationType.WINDOWS : WorkStationType.LINUX;
            WorkStation ws = c.createWorkstation(t, data[1]);
            System.out.println("- Mise à jour effectuée de " + ws);
        }
    }
}