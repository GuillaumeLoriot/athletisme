package Class;
import java.util.HashSet;


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

    public String afficherResultatsEpreuve(Epreuve nomEpreuve){

        double resultat;

        return resultat;

    };

    public  classementGeneral(){

    };
    public afficherClassementGeneral(){

    };

}
