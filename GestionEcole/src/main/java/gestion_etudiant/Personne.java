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
public abstract class Personne {
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String mail;
    
    
    

    public Personne(int id, String nom, String prenom, String adresse, String tel, String mail) {
        this.id = id;
        this.nom = nom;
        this.prenom= prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.mail = mail;
        
    }
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", tel=" + tel + ", mail=" + mail + '}';
    }

    

   






}