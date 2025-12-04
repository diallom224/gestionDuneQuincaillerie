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


        System.out.println("=================== affichage d'une piece composite en kit ============================");
        PieceCompositeEnKit janteKit = new PieceCompositeEnKit("jante en kit", "14541", 10);
        janteKit.ajoute(disqueJante);
        janteKit.ajoute(rayon);
        janteKit.ajoute(rayon);
        janteKit.ajoute(rayon);

        PieceCompositeEnKit roueBrouetteKit = new PieceCompositeEnKit("roue de brouette en kit", "11512", 15);
        roueBrouetteKit.ajoute(pneu);
        roueBrouetteKit.ajoute(chambreAir);
        roueBrouetteKit.ajoute(janteKit);

        janteKit.affiche();


        System.out.println("=================== affichage d'une piece composite Montee ============================");

        // ✅ Création d’une pièce composite montée
        PieceCompositeMontee roueBrouetteMontee =
                new PieceCompositeMontee("roue de brouette montée", "99887", 25, 8.0);

        // On ajoute les mêmes pièces que pour la version en kit
        roueBrouetteMontee.ajoute(pneu);
        roueBrouetteMontee.ajoute(chambreAir);
        roueBrouetteMontee.ajoute(janteKit);  // la jante montée dans la roue

        // Affichage complet
        roueBrouetteMontee.affiche();
    }
}
