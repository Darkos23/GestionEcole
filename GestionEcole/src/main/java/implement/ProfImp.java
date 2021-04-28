/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import dao.IProf;


import gestion_etudiant.Prof;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sarr
 */
public class ProfImp implements IProf {
    
    ArrayList<Prof> profs = new ArrayList<>();

    @Override
    public void addProf(Prof Prof) {
        profs.add(Prof);
    }

    @Override
    public void removeProf(Prof Prof) {
       profs.remove(Prof);
    }

    @Override
    public void updateProf(Prof Prof) {
       
    }

    @Override
    public Prof getProfbyId(int i) {
        for(Prof p:profs){
            if(p.getId()==i){
            return p;
            }
        }
        return null;
    }

    @Override
    public List<Prof> getAllProf() {
      
        return profs;
    }

 
   
    
}
