package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {

    public static List<Szuperhos> szuperhosLista = new ArrayList<>();
    public static void szereplok(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] sor = line.split(" ");
                if ("Batman".equals(sor[0])) { // Use .equals() for string comparison
                    Batman batman = new Batman();
                    for (int i = 0; i < Integer.parseInt(sor[1]); i++) {
                        batman.kutyutKeszit();
                    }
                    szuperhosLista.add(batman);
                } else if ("Vasember".equals(sor[0])) { // Use .equals() for string comparison
                    Vasember vasember = new Vasember();
                    for (int i = 0; i < Integer.parseInt(sor[1]); i++) {
                        vasember.kutyutKeszit();
                    }
                    szuperhosLista.add(vasember);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void szuperhosok() {
        for (int i = 0; i < szuperhosLista.size(); i++) {
            System.out.println(szuperhosLista.get(i).toString());
        }
    }

}
