package Class;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Recherche {
    public static void rechercherAthletes(ArrayList<Athlete> listeAthletes) {
        Scanner scanner = new Scanner(System.in);
        String nomRecherche, prenomRecherche;
        Pattern patternNom, patternPrenom;
        boolean trouve = false;

        System.out.println("--- Recherche d'athlètes ---");
        System.out.println();

        System.out.print("Nom : ");
        nomRecherche = scanner.nextLine().trim();
        System.out.print("Prenom : ");
        prenomRecherche = scanner.nextLine().trim();

        patternNom = Pattern.compile(nomRecherche, Pattern.CASE_INSENSITIVE);
        patternPrenom = Pattern.compile(prenomRecherche, Pattern.CASE_INSENSITIVE);

        // Aucune saisie : recherche annulée
        if (nomRecherche == "" && prenomRecherche == "") {
            return;
        }

        // Recherche avec nom et prenom
        if (nomRecherche != "" && prenomRecherche != "") {
            for (Athlete ath : listeAthletes) {
                if (patternNom.matcher(ath.nom).find() && patternPrenom.matcher(ath.prenom).find()) {
                    System.out.println("Nom : " + ath.nom + "     Prenom : " + ath.prenom);
                    trouve = true;
                }
            }
            if (!trouve) {
                System.out.println(("Aucun athlete trouve"));
            }
            return;
        }

        // Recherche sur le nom uniquement
        if (nomRecherche != "") {
            for (Athlete ath : listeAthletes) {
                // Recherche par nom dans un premier temps
                if (patternNom.matcher(ath.nom).find()) {
                    System.out.println("Nom : " + ath.nom + "     Prenom : " + ath.prenom);
                    trouve = true;
                }
            }
            if (!trouve) {
                System.out.println(("Aucun athlete trouve"));
            }
            return;
        }

        // Recherche sur le prenom uniquement
        for (Athlete ath : listeAthletes) {
            // Recherche par nom dans un premier temps
            if (patternPrenom.matcher(ath.prenom).find()) {
                System.out.println("Nom : " + ath.nom + "     Prenom : " + ath.prenom);
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println(("Aucun athlete trouve"));
        }
    }
}