public class Projet {
    public static void main(String[] args) {
        Visiteur v = new Visiteur("Santo", "Papa", "APIX", "779818854", "diaby@santo.com");
        v.afficherVisiteur();

        Location l = new Location(1, 15000000, null, null);
        l.afficherLocation();
    }
}