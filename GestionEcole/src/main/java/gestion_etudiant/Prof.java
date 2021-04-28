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
public class Prof extends Personne{
    private String spécialité;

    public Prof(int id, String nom, String prenom, String adresse, String tel, String mail,String spécialité) {
        super(id,nom,prenom,adresse,tel,mail);
        this.spécialité = spécialité;
    }

    
    
    public String getSpécialité() {
        return spécialité;
    }

    public void setSpécialité(String spécialité) {
        this.spécialité = spécialité;
    }

    @Override
    public String toString() {
        return "Prof{" + "sp\u00e9cialit\u00e9=" + spécialité + '}';
    }

    
    
    
    
    
}
