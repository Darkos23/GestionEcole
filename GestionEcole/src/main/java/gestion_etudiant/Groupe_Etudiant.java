/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_etudiant;

import java.util.Arrays;

/**
 *
 * @author Sarr
 */
public class Groupe_Etudiant {
     private Groupe groupe;
	private Etudiant[] etudiant;
	
	public Groupe_Etudiant() {
		
	}
	
	public Groupe_Etudiant(Groupe groupe, Etudiant[] etudiant) {
		super();
		this.groupe = groupe;
		this.etudiant = etudiant;
	}
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	public Etudiant[] getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant[] etudiant) {
		this.etudiant = etudiant;
	}
	@Override
	public String toString() {
		return "GroupeEtudiant [groupe=" + groupe + ", etudiant=" + Arrays.toString(etudiant) + "]";
	}
}
