package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bdd {
    private static final String FILENAME = "ListWS.csv";

    public static List<String[]> getListWorkStations() {
        try {
            BufferedReader reader  = new BufferedReader(new FileReader(FILENAME));
            List<String[]> lst = new ArrayList<>();
            String ligne;
            while ((ligne = reader.readLine()) != null) { lst.add(ligne.split(";")); }
            reader.close();
            return lst;
        } catch (IOException e) {  e.printStackTrace(); return null; }
    }
}