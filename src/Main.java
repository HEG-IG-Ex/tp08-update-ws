import factory.CompanyABC;
import metier.Applic;

public class Main {
    public static void main(String[] args) {
        Applic a = new Applic(new CompanyABC());
        a.majDeToutesLesStations();
    }
}