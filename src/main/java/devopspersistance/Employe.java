/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devopspersistance;

/**
 *
 * @author Administrateur
 */
public class Employe {
    static final int MAX_EMPLOYE = 10;
    static int nbEmploi;
    private String nom;
    private String prenom;
    private float salaire;
    private int teldom;
    private int telport;
    private int telpro;
    private String Adresse;
    private int codepostale;
    private String ville;
    private String email;
    private Employe tabEmploye;
    

    public Employe() {
        nbEmploi++;
    }

    public Employe(String nom, String prenom, float salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        nbEmploi++;
        
    }

    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Salaire : " + salaire);
    }

    public void setTeldom(int teldom) {
        this.teldom = teldom;
    }

    public void setTelport(int telport) {
        this.telport = telport;
    }

    public void setTelpro(int telpro) {
        this.telpro = telpro;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public void setCodepostale(int codepostale) {
        this.codepostale = codepostale;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTeldom() {
        return teldom;
    }

    public int getTelpro() {
        return telpro;
    }

    public String getAdresse() {
        return Adresse;
    }

    public int getCodepostale() {
        return codepostale;
    }

    public String getVille() {
        return ville;
    }

    public String getEmail() {
        return email;
    }

    public void setSalaire(float unSalaire) {
        try{
       salaire = unSalaire;
        }
        catch(NumberFormatException e)
        {
            System.out.println(e.toString());
        }
    }
  public float getSalaire() {
        return salaire;
    }
    static void nbEmploye() {

        System.out.println("\n Le nombre d'employe : " + nbEmploi);

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return  "nom=" + nom + "\n prenom=" + prenom + "\n salaire=" + salaire + "\n teldom=" + teldom + "\n telport=" + telport + "\n telpro=" + telpro + "\n Adresse=" + Adresse + "\n codepostale=" + codepostale + "\n ville=" + ville + "\n email=" + email;
    }
 

    
    

}
