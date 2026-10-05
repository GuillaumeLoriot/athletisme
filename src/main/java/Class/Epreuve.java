package Class;

import java.util.HashMap;

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
    String[] classement(){
    String[] result= new String[this.resultats.size()];
    return result;
    }
}
