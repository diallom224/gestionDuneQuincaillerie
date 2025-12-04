public class PieceCompositeEnKit extends PieceComposite {
    protected int dureeMontage;
    public PieceCompositeEnKit(String nom, String reference,int dureeMontage){
        super(nom,reference);
        this.dureeMontage = dureeMontage;
    }

    protected void setReference(String reference){
        this.reference = reference;
    } 

    @Override
    public double prix(){
       return super.prix();
    }

    @Override
    public int dureeGarantie(){
        return super.dureeGarantie();
    } 


   @Override
    public void affiche() {
        System.out.println("nom : " + nom);
        System.out.println("référence : " + reference);
        System.out.println("prix : " + prix() + " euros");
        System.out.println("garantie : " + dureeGarantie() + " mois");
        System.out.println("durée de fabrication : " + dureeFabrication() + " jour(s)");
        System.out.println("durée de montage particulier : " + dureeMontage + " mn");
        System.out.println("composants :");
        for (Piece p : liste) {
            System.out.println("   " + p.toString());
        }
    }

}