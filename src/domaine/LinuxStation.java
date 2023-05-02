package domaine;

public class LinuxStation extends WorkStation{

    public LinuxStation(String nom) {
        super(nom);
    }

    @Override
    public boolean connect() {
        System.out.println("Connect Linux to " + this.toString());
        return true;
    }

}
