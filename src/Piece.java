

public abstract class Piece {
    protected String nom;
    protected String reference;


    //Le constructeur 
    public Piece(String nom,String reference){
        this.nom = nom;
        if(reference.charAt(0)=='0'){
            this.reference = "0"+reference;
        }else{
            this.reference = "00"+reference;
        }
        
    }

   @Override
    public String toString() {
        return nom + " - " + reference;
    }

    protected void setReference(String reference){
        this.reference = reference;
    }


    // mes classe abstract : 

    public abstract void affiche();

    public abstract double prix();

    public abstract int dureeGarantie();

    public abstract int dureeGarantieDeBase();

    public abstract int dureeFabrication();

    
}