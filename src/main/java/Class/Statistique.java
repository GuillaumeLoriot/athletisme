package Class;

public class Statistique {

    public static void statistiquesEpreuve(Epreuve nom){
        double max=0;
        double min=-1;
        double moy=0;

        for (double score: Epreuve.resultats.values()){
            if (min==-1||min<score){min=score;}
            if (max>score){max=score;}
            moy=moy+score;
        }
        moy=moy/(double) Epreuve.resultats.size();
        double ecartT=0;
        for (double score: Epreuve.resultats.values()){
            ecartT=ecartT+Math.pow(score-moy,2);
        }
        ecartT=Math.pow(ecartT/(double) Epreuve.resultats.size(),0.5);
        System.out.println(Epreuve.nom+": ");
        System.out.println(Epreuve.nom+": ");
    }

    private int Ma() {
    }
}
