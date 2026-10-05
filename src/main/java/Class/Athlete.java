package Class;

public class Athlete {
    String nom;
    String prenom;
    int age;
    String pays;
    String equipe;

    Athlete(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    void completerInfo(Integer age, String pays, String equipe) {
        this.age = age;
        this.pays = pays;
        this.equipe = equipe;
    }
}
