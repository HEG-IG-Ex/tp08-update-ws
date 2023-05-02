package factory;

import domaine.LinuxStation;
import domaine.WindowsStation;
import domaine.WorkStation;
import domaine.WorkStationType;

public class WorkStationFactory {
    public static WorkStation createWorkstation(WorkStationType t, String nom){
        switch(t){
            case WINDOWS:
                return new WindowsStation(nom);

            case LINUX:
                return new LinuxStation(nom);

            default:
                return null;
        }
    }
}
