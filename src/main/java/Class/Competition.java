package Class;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;


public class Competition {

    String nom;
    int annee;
    HashSet<Athlete> athletes;
    HashSet<Epreuve> epreuves;


    public void ajouterAthlete(Athlete athlete){

        this.athletes = new HashSet<>();

        athletes.add(athlete);

    };

    public void ajouterEpreuve(Epreuve epreuve){

        this.epreuves = new HashSet<>();

        epreuves.add(epreuve);

    };

    public HashMap afficherResultatsEpreuve(Epreuve nomEpreuve){


        HashMap<Athlete, Double> resultats = new HashMap<>();
        HashMap<Athlete, Double> resultatsTries = new HashMap<>();

        resultats = nomEpreuve.resultats;
        double min = 0;

        for (Map.Entry<Athlete, Double> entry : resultats.entrySet()) {
            Double score = entry.getValue();
            if (score < min){
                min = score;
                resultatsTries.put(entry.getKey(), entry.getValue());
            }

        }

        return System.out.println(String.valueOf(resultatsTries));


    };

    /*public  classementGeneral(){

    };
    public afficherClassementGeneral(){

    };*/

}
