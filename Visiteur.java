

public class Visiteur {
    private String mNom;
    private String mPrenom;
    private String mAdresse;
    private String mTelephone;
    private String mEmail;

    public Visiteur(String nom, String prenom, String adresse, String telephone, String email){
        this.mNom = nom;
        this.mPrenom = prenom;
        this.mAdresse = adresse;
        this.mTelephone = telephone;
        this.mEmail = email;
    }

    public void afficherVisiteur(){
        System.out.println("Le visiteur " + this.mPrenom + " " + this.mNom + " habitant de " + this.mAdresse + " a pour numéro " + this.mTelephone + " et pour mail " + this.mEmail);
    }
}