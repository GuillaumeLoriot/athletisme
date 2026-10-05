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
    int i=0;
    for (Map.Entry<Athlete, Double> entry : this.resultats.entrySet()) {
        // entry.getValue- entry.getKey();
        result[i]=entry.getKey();
        i++;
    }
    Athlete tmp;
    int coef= this.sensTri==TypeClassement.ASC? 1:-1;
        for (i=0;i< result.length-1;i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if ((this.resultats.get(result[j]) - this.resultats.get(result[j + 1])) * coef > 0) {
                    tmp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = tmp;
                }
            }
        }
    return result;
}
}
