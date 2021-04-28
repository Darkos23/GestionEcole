/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import gestion_etudiant.Groupe;
import java.util.List;

/**
 *
 * @author Sarr
 */
public interface IGroupe {
    
     public void addGroupe(Groupe groupe);
    public void removeGroupe(Groupe groupe);
    public void updateGroupe(Groupe groupe);
    public Groupe getGroupebyId(int i);
    public List<Groupe> getAllGroupe();
    
}
