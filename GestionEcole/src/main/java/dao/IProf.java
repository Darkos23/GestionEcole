/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import gestion_etudiant.Prof;
import java.util.List;

/**
 *
 * @author Sarr
 */
public interface IProf {
    public void addProf(Prof Prof);
    public void removeProf(Prof Prof);
    public void updateProf(Prof Prof);
    public Prof getProfbyId(int i);
    public List<Prof> getAllProf();
}
