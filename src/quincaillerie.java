public class quincaillerie {
    public static void main(String[] args){
        PieceDeBase pneu = new PieceDeBase("pneu", "04741", 12.5, 60, 2);
        PieceDeBase chambreAir = new PieceDeBase("chambre à air", "4565", 4.0, 20, 2);
        PieceDeBase disqueJante = new PieceDeBase("disque de jante", "1214", 4.5, 60, 2);
        PieceDeBase rayon = new PieceDeBase("rayon", "04748", 1.0, 20, 1);


        System.out.println("===================== pneu =================================");
        pneu.affiche();
        System.out.println("===================== chambreAir =================================");
        chambreAir.affiche();
        System.out.println("===================== disqueJante =================================");
        disqueJante.affiche();
        System.out.println("===================== rayon =================================");
        rayon.affiche();
    }

}
