import java.util.ArrayList;



public abstract class PieceComposite extends Piece {
    protected ArrayList<Piece> liste; 
    
    public PieceComposite(String nom, String reference) {
        super(nom, reference);
        liste = new ArrayList<>();
    }
   
    public void ajoute(Piece p) {
        liste.add(p);
    }
    
    @Override 
    public double prix() { 
        double totalPrix = 0.0;
        for(Piece p : liste){
            totalPrix += p.prix();
        }
        return totalPrix; 
    }
    
    @Override 
    public int dureeGarantie() { 
        if(liste.isEmpty())return 0;

        int garantieMin = Integer.MAX_VALUE;

        for(Piece p : liste){

            int dg = p.dureeGarantie();

            if(dg < garantieMin)garantieMin = dg;
        }

        return garantieMin;                                                                                                                              
    }
    
    @Override 
    public int dureeGarantieDeBase() { 
        if (liste.isEmpty()) {
            return 0;
        }
        int minGarantie = Integer.MAX_VALUE;
        for (Piece p : liste) {
            int g = p.dureeGarantieDeBase();
            if (g < minGarantie) {
                minGarantie = g;
            }
        }
        return minGarantie;
    }
    
    @Override 
    public int dureeFabrication() { 
        if (liste.isEmpty()) {
            return 0;
        }
        int maxDuree = 0;
        for (Piece p : liste) {
            int d = p.dureeFabrication();
            if (d > maxDuree) {
                maxDuree = d;
            }
        }
        return maxDuree;
    }
    
    @Override 
    public void affiche() { }
}