package Class;

import java.util.HashMap;
import java.util.Map;

public class Epreuve {
static String nom;
static String type;
static String unite;
static TypeClassement sensTri;
static HashMap<Athlete,Double> resultats;

public Epreuve(String nom, String type, TypeClassement sensTri){
    this.nom=nom;
    this.type=type;
    this.sensTri=sensTri;
    this.resultats= new HashMap<>();
}
    void enregistrerResultat(Athlete ath,double score){
    if (this.resultats.containsKey(ath)){
        this.resultats.replace(ath,score);
    } else {
        this.resultats.put(ath,score);
    }
    }
    Athlete[] classement() {
        Athlete[] result = new Athlete[this.resultats.size()];
        for (Map.Entry<Athlete, Double> entry : this.resultats.entrySet()) {
            // entry.getValue- entry.getKey();


    }

    return result;
    }
}
