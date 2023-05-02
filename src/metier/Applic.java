package metier;

import domaine.WorkStation;
import domaine.WorkStationType;
import factory.WorkStationFactory;

public class Applic {
    public static void majDeToutesLesStations() {
        for (String[] data : dao.Bdd.getListWorkStations()) {
            WorkStationType t = data[0].equalsIgnoreCase("windows") ? WorkStationType.WINDOWS : WorkStationType.LINUX;
            WorkStation ws = WorkStationFactory.createWorkstation(t, data[1]);
            System.out.println("- Mise à jour effectuée de " + ws);
        }
    }
}