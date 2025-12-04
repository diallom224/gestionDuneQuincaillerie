
public class PieceCompositeMontee extends PieceComposite {
    protected int dureeMontage;
    protected double prixMontage;

    public PieceCompositeMontee(String nom, String reference,int dureeMontage,double prix){
        super(nom,reference);
        this.dureeMontage = dureeMontage;
        this.prixMontage = prixMontage;
        
    }

    @Override
    protected void setReference(String reference) {
        this.reference = "00" + reference;
    }

    public double prix(){
        return super.prix()+prixMontage;
    }

    @Override
    public int dureeGarantie() {
       return super.dureeGarantie();
    }
    

    


     @Override
    public int dureeFabrication() {
        return super.dureeFabrication() + dureeMontage;
    }


    @Override
    public void ajoute(Piece p) {
        liste.add(p);
    }

    
    
    @Override
    public void affiche() {
        System.out.println("nom : " + nom);
        System.out.println("référence : " + reference);
        System.out.println("prix : " + prix() + " euros");
        System.out.println("garantie : " + dureeGarantie() + " mois");
        System.out.println("durée de fabrication : " + dureeFabrication() + " jour(s)");
        System.out.println("durée de montage atelier : " + dureeMontage + " jour(s)");
        System.out.println("prix du montage : " + prixMontage + " euros");
        System.out.println("composants :");
        for (Piece p : liste) {
            System.out.println("   " + p.toString());
        }
    }
}

