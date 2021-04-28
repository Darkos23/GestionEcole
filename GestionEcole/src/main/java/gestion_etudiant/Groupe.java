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
public class Groupe {
    private int id_groupe;
    private String nom_groupe;
    private String module_groupe;

    public Groupe() {
    }

    public Groupe(String nom_groupe,int id_groupe,String module_groupe) {
        this.id_groupe=id_groupe;
        this.nom_groupe=nom_groupe;
        this.module_groupe=module_groupe;
    }

    public int getId_groupe() {
        return id_groupe;
    }

    public void setId_groupe(int id_groupe) {
        this.id_groupe = id_groupe;
    }

    public String getNom_groupe() {
        return nom_groupe;
    }

    public void setNom_groupe(String nom_groupe) {
        this.nom_groupe = nom_groupe;
    }

    public String getModule_groupe() {
        return module_groupe;
    }

    public void setModule_groupe(String module_groupe) {
        this.module_groupe = module_groupe;
    }


  
    @Override
    public String toString() {
        return "Groupe{" + "id_groupe=" + id_groupe + ", nom_groupe=" + nom_groupe + ", module_groupe=" + module_groupe + '}';
    }
        


    
}
