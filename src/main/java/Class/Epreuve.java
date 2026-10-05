package Class;

import java.util.HashMap;

public class Epreuve {
static String nom;
static String type;
static String unite;
static TypeClassement sensTri;
static HashMap<Athlete,Double> Map;

public Epreuve(String nom, String type, TypeClassement sensTri){
    this.nom=nom;
    this.type=type;
    this.sensTri=sensTri;
    this.Map= new HashMap<>();
}
    void enregistrerResultat(Athlete ath,double score){
    if (this.Map.containsKey(ath)){
        this.Map.replace(ath,score);
    } else {
        this.Map.put(ath,score);
    }
    }
    String[] classement(){
    String[] result= new String[this.Map.size()];
    return result;
    }
}
