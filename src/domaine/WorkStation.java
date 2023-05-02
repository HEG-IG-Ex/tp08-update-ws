package domaine;

public abstract class WorkStation implements Connectable{
    private String nom;

    public WorkStation(String nom) {
        this.nom = nom;
        connect();
        update();
    }

    public void update() {System.out.println("- UpdateWS " + this.nom); }

    @Override
    public String toString() { return nom; }
}