package Class;

public class Main {
    static void main(String[] args) {
        //1. Creer 8 athletes de 4 pays / 2 equipes
        //2. Creer 3 epreuves : "100m" (ASC), "Saut en longueur" (DESC), "Lancer du poids" (DESC)
        Athlete joueur1 = new Athlete("Bolt", "Usain", 30, "Jamaique", "Lightning");
        Athlete joueur2 = new Athlete("joueur2", "Annick", 30, "Jamaique", "Lightning");
        Athlete joueur3 = new Athlete("joueur3", "Marine", 30, "Brésil", "Lightning");
        Athlete joueur4 = new Athlete("joueur1", "Guillaume", 30, "Brésil", "Lightning");
        Athlete joueur5 = new Athlete("Coleman", "Christian", 30, "USA", "Diamond");
        Athlete joueur6 = new Athlete("joueur6", "Romain", 30, "USA", "Diamond");
        Athlete joueur7 = new Athlete("joueur7", "Jean", 30, "Australie", "Diamond");
        Athlete joueur8 = new Athlete("joueur8", "Medhi", 30, "Australie", "Diamond");
        Epreuve centMetres = new Epreuve("100m", "individuel", TypeClassement.ASC);
        Epreuve sautHaut = new Epreuve("Saut en hauteur", "individuel", TypeClassement.DESC);
        Epreuve lancerPoids = new Epreuve("Lancer de poids", "individuel", TypeClassement.DESC);


    }
}
