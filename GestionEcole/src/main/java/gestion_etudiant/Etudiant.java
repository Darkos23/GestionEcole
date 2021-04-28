/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_etudiant;

/**
 *
 * @author Sarr
 */
public class Etudiant extends Personne{
    
    private String carte_etudiant;

    
    
    public Etudiant(int id, String nom, String prenom, String adresse, String tel, String mail,String carte_etudiant) {
        super(id,nom,prenom,adresse,tel,mail);
        this.carte_etudiant = carte_etudiant;
    }



    public String getCarte_etudiant() {
        return carte_etudiant;
    }

    public void setCarte_etudiant(String carte_etudiant) {
        this.carte_etudiant = carte_etudiant;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "carte_etudiant=" + carte_etudiant + '}';
    }
    
    
    
}


