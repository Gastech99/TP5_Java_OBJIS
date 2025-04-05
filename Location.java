import java.sql.Date;

public class Location {
    private int mNumLocation;
    private int mPrixLocation;
    private Date mDateDebut;
    private Date mDateFin;

    public Location(int numLocation, int prixLocation, Date dateDebut, Date dateFin){
        this.mNumLocation = numLocation;
        this.mPrixLocation = prixLocation;
        this.mDateDebut = dateDebut;
        this.mDateFin = dateFin;
    }

    public void afficherLocation(){
        System.out.println("La location " + this.mNumLocation + "qui coute " + this.mPrixLocation + "commence " + this.mDateDebut + "et se termine le " + this.mDateFin);
    }
}
