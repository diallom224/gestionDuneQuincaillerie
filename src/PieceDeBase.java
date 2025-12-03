


public class PieceDeBase extends Piece {
    
    protected double prix;
    protected int dureeGarantie;
    protected int dureeFabrication;

    public PieceDeBase(String nom, String reference , double prix,int dureeGarantie,int dureeFabrication){
        super(nom,reference);

        if(prix < 0)this.prix=prix;
        if(dureeGarantie<0) this.dureeGarantie = dureeGarantie;
        if(dureeFabrication<0)this.dureeFabrication = dureeFabrication;

        this.prix=prix;
        this.dureeGarantie = dureeGarantie;
        this.dureeFabrication = dureeFabrication;
    }

    @Override
    protected void  setReference(String reference){
        this.reference = "00"+reference;
    }


    @Override
    public void affiche(){
        System.out.println("nom :"+ nom);
        System.out.println("référence :"+reference);
        System.out.println("prix :"+ prix+ "euros");
        System.out.println("garantie :"+ dureeGarantie+ "mois");
        System.out.println("durée de fabrication :"+ dureeFabrication + "jours(s)");
    }

    @Override
    public double prix(){
        return prix;
    }

    @Override
    public int  dureeGarantie(){
        return dureeGarantie;
    }

    @Override
    public int dureeGarantieDeBase(){
        return dureeGarantie;
    }

    @Override
    public int dureeFabrication(){
        return dureeFabrication;
    }
}