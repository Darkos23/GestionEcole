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
public class Module {
    
   private String nomModule;
   private int coeff;
   private Prof prof;

    public Module(String nomModule, int coeff, Prof prof) {
        this.nomModule = nomModule;
        this.coeff = coeff;
        this.prof = prof;
    }

    public String getNomModule() {
        return nomModule;
    }

    public void setNomModule(String nomModule) {
        this.nomModule = nomModule;
    }

    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    @Override
    public String toString() {
        return "Module{" + "nomModule=" + nomModule + ", coeff=" + coeff + ", prof=" + prof + '}';
    }
   
   
   
   
}

