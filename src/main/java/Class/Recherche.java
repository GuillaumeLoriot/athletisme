package Class;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Recherche {
    public static ArrayList<String> rechercherAthletes(ArrayList<Athlete> listeAthletes) {
        Scanner scanner = new Scanner(System.in);
        String nomRecherche, prenomRecherche;
        Pattern patternNom, patternPrenom;
        ArrayList<String> listeAthletesTrouves = new ArrayList<>();

        System.out.println("--- Recherche d'athletes ---");
        System.out.println();

        System.out.print("Nom : ");
        nomRecherche = scanner.nextLine().trim();
        System.out.print("Prenom : ");
        prenomRecherche = scanner.nextLine().trim();

        scanner.close();

        patternNom = Pattern.compile(nomRecherche, Pattern.CASE_INSENSITIVE);
        patternPrenom = Pattern.compile(prenomRecherche, Pattern.CASE_INSENSITIVE);

        // Aucune saisie : recherche annulée
        if (nomRecherche.equals("") && prenomRecherche.equals("")) {
            return listeAthletesTrouves;
        }

        // Recherche avec nom et prenom
        if (!nomRecherche.equals("") && !prenomRecherche.equals("")) {
            for (Athlete ath : listeAthletes) {
                if (patternNom.matcher(ath.nom).find() && patternPrenom.matcher(ath.prenom).find()) {
                    listeAthletesTrouves.add(ath.nomComplet());
                }
            }
            return listeAthletesTrouves;
        }

        // Recherche sur le nom uniquement
        if (!nomRecherche.equals("")) {
            for (Athlete ath : listeAthletes) {
                // Recherche par nom dans un premier temps
                if (patternNom.matcher(ath.nom).find()) {
                    listeAthletesTrouves.add(ath.nomComplet());
                }
            }
            return listeAthletesTrouves;
        }

        // Recherche sur le prenom uniquement
        for (Athlete ath : listeAthletes) {
            if (patternPrenom.matcher(ath.prenom).find()) {
                listeAthletesTrouves.add(ath.nomComplet());
            }
        }
        return listeAthletesTrouves;
    }

    public static ArrayList<String> filtrerParPays(ArrayList<Athlete> listeAthletes) {
        Scanner scanner = new Scanner(System.in);
        String paysFiltre;
        ArrayList<String> listeAthletesTrouves = new ArrayList<>();

        System.out.println("--- Filtrer les athletes par pays ---");
        System.out.println();

        System.out.print("Pays : ");
        paysFiltre = scanner.nextLine().trim().toLowerCase();
        scanner.close();

        if (paysFiltre.equals("")) {
            return listeAthletesTrouves;
        }

        for (Athlete ath : listeAthletes) {
            if (paysFiltre.equals(ath.pays.toLowerCase())) {
                listeAthletesTrouves.add(ath.nomComplet());
            }
        }

        return listeAthletesTrouves;
    }
}

