/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import gestion_etudiant.Etudiant;
import java.util.List;

/**
 *
 * @author Sarr
 */
public interface IEtudiant {
    
    public void addEtudiant(Etudiant etudiant);
    public void removeEtudiant(Etudiant etudiant);
    public void updateEtudiant(Etudiant etudiant);
    public Etudiant getEtudiantbyId(int i);
    public List<Etudiant> getAllEtudiant();
}
