/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import dao.IEtudiant;
import gestion_etudiant.Etudiant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sarr
 */
public class EtudiantImp implements IEtudiant {

     ArrayList<Etudiant> etudiants = new ArrayList<>();
    
    
    @Override
    public void addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    
    @Override
    public void removeEtudiant(Etudiant etudiant) {
        etudiants.remove(etudiant);
    }

    
    @Override
    public void updateEtudiant(Etudiant etudiant) {
        for(Etudiant etudiant2:etudiants){
        
        if(etudiant2.getId()==etudiant.getId()){
            
            etudiant2.setAdresse(etudiant.getAdresse());
            etudiant2.setCarte_etudiant(etudiant.getCarte_etudiant());
            etudiant2.setNom(etudiant.getNom());
            etudiant2.setMail(etudiant.getMail());
            etudiant2.setPrenom(etudiant.getPrenom());
            
        }
    }
   }
    
    @Override
    public Etudiant getEtudiantbyId(int i) {
        
        for(Etudiant etudiant:etudiants){
            
            if(etudiant.getId()==i){
       return etudiant;
    }
        }
        return null;
    }
    
    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiants;
    }

    
}
