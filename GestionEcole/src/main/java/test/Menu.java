/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import gestion_etudiant.Etudiant;
import gestion_etudiant.Groupe;
import gestion_etudiant.Prof;
import implement.EtudiantImp;
import implement.GroupeImp;
import implement.ProfImp;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sarr
 */
public class Menu {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
   //on initialise les implementations
     EtudiantImp etudiantImp = new EtudiantImp();
     ProfImp profImp = new ProfImp();
     GroupeImp groupeImp = new GroupeImp();
        
     boolean var=true;
     
     while(var){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$__________--^--__________$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                   System.out.println("*****.....*****.....*****-------- *MENU PRINCIPAL* -------*****.....*****.....*****");
                   System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$__________-----__________$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
                   System.out.println(" ***Choisissez une option*** ");
                   System.out.println("1 : Gestion Groupe");
                   System.out.println("2 : Gestion Etudiants");
                   System.out.println("3 : Gestion Professeurs");
                   System.out.println("4 : Gestion Groupe-Etudiant");
                   System.out.println("5 : Quitter");
                   System.out.print("Vous avez choisi: ");
                    int choix = sc.nextInt();
    
   switch(choix){
       case 2:
            boolean var1=true;
            while(var1){
       
            System.out.print("********* GESTION ETUDIANT *********\n");
                   System.out.println("1 : Ajouter Etudiant");
                   System.out.println("2 : Modifier un Etudiant");
                   System.out.println("3 : Voir Détails");
                   System.out.println("4 : Supprimer Etudiant");
                   System.out.println("5 : Lister Etudiants");
                   System.out.println("6 : QUITTER ");  
                   System.out.print("Vous avez choisi: ");
                   int choixEtudiant = sc.nextInt();
                  
            switch(choixEtudiant){
            case 1:
                     System.out.println("Ajouter Etudiant");

    System.out.println("Entrez le prenom de l'étudiant : ");
    String prenom = sc.next();
    
    System.out.println("Entrez le nom de l'étudiant : ");
    String nom = sc.next();
        
    System.out.println("Entrez l'adresse de l'étudiant: ");
    String adresse = sc.next();
    
    System.out.println("Entrez le telephone de l'étudiant: ");
    String tel = sc.next();
    
    System.out.println("Entrez l'email de l'étudiant: ");
    String mail = sc.next();
      
    System.out.println("Entrez le numéro badge de l'étudiant: ");
    String carte_etudiant = sc.next();
    
    System.out.println("Entrez l' id de l'étudiant: ");
    int id = sc.nextInt();  
   //requete d'ajout
    Etudiant etudiant= new Etudiant(id,nom,prenom,adresse,tel,mail,carte_etudiant);
    etudiantImp.addEtudiant(etudiant);
    System.out.println("Etudiant ajouté avec succés !!! \n");
                     break;
                    
            case 2:
                    System.out.println("Modifier un Etudiant");
                    
    System.out.println("Donnez l'Id :");
    //requete de modification
    int idMod = sc.nextInt();                     
    Etudiant etudiant3= etudiantImp.getEtudiantbyId(idMod);
    etudiantImp.updateEtudiant(etudiant3);
    
    System.out.print("Entrez le prenom de l'étudiant : ");
    String prenomE = sc.next();
    etudiant3.setPrenom(prenomE);
    
    System.out.print("Entrez le nom de l'étudiant : ");
    String nomE = sc.next();
    etudiant3.setNom(nomE);
    
                   
    System.out.println("Entrez l'adresse de l'étudiant: ");
    String adresseE = sc.next();
    etudiant3.setAdresse(adresseE);
    
    System.out.println("Entrez le telephone de l'étudiant: ");
    String telE = sc.next();
    etudiant3.setTel(telE);
    
    System.out.println("Entrez l'email de l'étudiant: ");
    String mailE = sc.next();
    etudiant3.setMail(mailE);
      
    System.out.println("Entrez le numéro badge de l'étudiant: ");
    String carte_etudiantE = sc.next();
    etudiant3.setCarte_etudiant(carte_etudiantE);
    
    System.out.println("Etudiant modifié avec succés !!!");
    break;
                        
            case 3:
                    System.out.println("Voir Détails");
                    
                    break;
                    
            case 4:
                    System.out.println("Supprimer Etudiant");
                    
                    System.out.println("Donnez l'id: ");
                    //requete de supression
                    int idSup=sc.nextInt();
                    Etudiant etudiant2 = etudiantImp.getEtudiantbyId(idSup);
                    etudiantImp.removeEtudiant(etudiant2);
                    
                    System.out.println("Supprimé avec succés !!!");
                    break;
                    
            case 5:
                    System.out.println("Afficher Etudiant");
                 //requete d'affichage
                List<Etudiant> etudiants = etudiantImp.getAllEtudiant();
                for(Etudiant etudiant4 : etudiants){
                System.out.print(etudiant4.getPrenom());
                System.out.print(" ");
                System.out.println(etudiant4.getNom());
                }
                    break;
            case 6:
                        System.out.println("Fin Modification...");
                        
                        var1=false;
                        var=true;
                    break;
                    
            default:
                System.out.println("Option invalide ! Choisir une autre !");
                break;
                   }
               
                   }
                break;
            
            
           
              
                
                
                
                
                
                
                
                
           case 1:
            System.out.print("********* GESTION GROUPE *********\n");
                   System.out.println("1 : Créer Groupe");
                   System.out.println("2 : Modifier un Groupe");
                   System.out.println("3 : Voir Détails");
                   System.out.println("4 : Supprimer Groupe");
                   System.out.println("5 : Lister Groupe");
                   System.out.println("6 : QUITTER");
                   System.out.println("Votre choix:");
            break;        
                
                
          
            
            
            
            
            
            
            
            
            
                
                
        case 3:
            
            boolean var2=true;
            
            while(var2){
                
            
            System.out.print("********* GESTION PROFESSEUR *********\n");
             System.out.println("1 : Ajouter Professeur");
                   System.out.println("2 : Modifier un Professeur");
                   System.out.println("3 : Voir Détails");
                   System.out.println("4 : Supprimer Professeur");
                   System.out.println("5 : Lister Professeurs");
                   System.out.println("6 : QUITTER");     
                   System.out.print("Votre choix: ");
                   int choixProf = sc.nextInt();
                  
            switch(choixProf){   
        case 1:
    System.out.println("Ajouter un professeur");
    
    System.out.println("Entrez le prenom du professeur : ");
    String prenom = sc.next();
    
    System.out.println("Entrez le nom du professeur : ");
      String nom = sc.next();
                
    System.out.println("Entrez l'adresse du professeur: ");
    String adresse = sc.next();
    
    System.out.println("Entrez le telephone du professeur: ");
    String tel = sc.next();
    
    System.out.println("Entrez l'email du professeur: ");
    String mail = sc.next();
    
    System.out.println("Donnez sa spécialité: ");
    String spécialité = sc.next();
    
    System.out.println("Entrez l' id du professeur: ");
    int id = sc.nextInt();  
    
    Prof prof= new Prof(id,nom,prenom,adresse,tel,mail,spécialité);
    prof.setSpécialité(spécialité);
    profImp.addProf(prof);
            System.out.println("Professeur ajouté avec succés !!!");
            break;
            
            
        case 2:
            System.out.println("Modifier un professeur");
            System.out.print("Donnez l'id du professeur :");
            //requete de modification
            int idprof = sc.nextInt();     
            Prof prof3= profImp.getProfbyId(idprof);
            profImp.updateProf(prof3);
    
    System.out.print("Entrez le prenom du professeur : ");
    String prenomE = sc.next();
    prof3.setPrenom(prenomE);
    
    System.out.print("Entrez le nom du professeur : ");
    String nomE = sc.next();
    prof3.setNom(nomE);
    
    System.out.println("Entrez l'adresse du professeur: ");
    String adresseE = sc.next();
    prof3.setAdresse(adresseE);
    
    System.out.println("Donnez la spécialité du professeur: ");
    String spécialitéE = sc.next();
    prof3.setSpécialité(spécialitéE);
    
    System.out.println("Modifié...");
     break;
     
        case 3:
            System.out.println("Voir Details");
            break;
            
            
        case 4:
            System.out.println("Supprimer Professeur");
            System.out.println("Donnez l'id: ");
            //supression
            int idsup=sc.nextInt();
                Prof prof2=profImp.getProfbyId(idsup);
                profImp.removeProf(prof2);
            System.out.println("Supprimé avec succés !!!");
            break;
            
        case 5:
            System.out.println("Afficher Professseurs");
            for(Prof prof4:profImp.getAllProf()){
                System.out.print(prof4.getPrenom());
                 System.out.print(" ");
                System.out.println(prof4.getNom());
            }
            break;
        case 6:
            System.out.println("Fin Modification...");
            System.exit(0);
            var=true;
            var2=false;
            break;
            
        default:
            System.out.println("Option invalide ! Choisir une autre !");
    
            break;
            }
   }
            
            
            
            
            
            
            
            case 4:
            System.out.print("********* GESTION GROUPE *********\n");
                   System.out.println("1 : Créer Groupe");
                   System.out.println("2 : Modifier un Groupe");
                   System.out.println("3 : Voir Détails");
                   System.out.println("4 : Supprimer Groupe");
                   System.out.println("5 : Lister Groupe");
                   System.out.println("6 : QUITTER");
                   System.out.println("Votre choix:");
                   
            System.out.println("choix: ");
            int choixGroupe= sc.nextInt();
            
         switch(choixGroupe){
             case 1:
                 System.out.println("Créer Groupe");
                 
            System.out.println("Donnez un nom au groupe: ");
            String nom_groupe = sc.next();
            System.out.println("Donnez un id au groupe");
            int id_groupe = sc.nextInt();
            System.out.println("Donnez le module du groupe: ");
            String module_groupe = sc.next();
            
            Groupe groupe= new Groupe(nom_groupe,id_groupe,module_groupe);
            groupe.setNom_groupe(nom_groupe);
            break;
            
             case 2:
                 System.out.println("Modifier un Groupe");
                 System.out.print("Entrez le nom du professeur : ");

           
              
                  break;
             case 3:
                 System.out.println("Voir Détails");
                 break;
                 
             case 4:
                 System.out.println("Supprimer Groupe");
                 
             System.out.println("Donnez le nom du groupe");
         
                  break;
             case 5:
                 System.out.println("Afficher Groupes");
                 break;
             case 6:
                 System.out.println("Fin Modification...");
                 break;
             default:
                 System.out.println("Retour au menu...");
         }
            break; 
         
            
            
                   
            
            }
     
   
   
   
   
   
   
  }
 }
}
    
    

