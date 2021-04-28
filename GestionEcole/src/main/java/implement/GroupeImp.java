/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import dao.IGroupe;
import gestion_etudiant.Groupe;




import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sarr
 */
public class GroupeImp implements IGroupe {
    
    ArrayList<Groupe> groupes = new ArrayList<>();

    @Override
    public void addGroupe(Groupe groupe) {
            groupes.add(groupe);
    }

    @Override
    public void removeGroupe(Groupe groupe) {
        groupes.remove(groupe);
    }

    @Override
    public void updateGroupe(Groupe groupe) {
        for(Groupe groupe2:groupes){
        if(groupe2.getNom_groupe() == groupe.getNom_groupe()){
        
            groupe2.setModule_groupe(groupe.getModule_groupe());
            groupe2.setNom_groupe(groupe.getNom_groupe());
            
           
        }
        }
    }

    @Override
    public Groupe getGroupebyId(int i) {
 for(Groupe groupe:groupes){
            
            if(groupe.getId_groupe()==i){
       return groupe;
    }
        }
        return null;    }

    @Override
    public List<Groupe> getAllGroupe() {
        return groupes;
    }

    



 
   
    
}
