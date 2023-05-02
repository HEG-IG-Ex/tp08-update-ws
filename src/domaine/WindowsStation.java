package domaine;

public class WindowsStation extends WorkStation{
    public WindowsStation(String nom) {
        super(nom);
    }

    @Override
    public boolean connect() {
        System.out.println("Connect Windows to " + this.toString());
        return true;
    }
}
