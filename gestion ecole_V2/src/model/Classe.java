/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nmalk
 */
public class Classe {
    //attribut
    private String id;
    private String nom;
    private String AnneeScolaire_id;
    private String Ecole_id;
    private String Niveau_id;
    
    
    //constructeur 
    public Classe(){
        id=null;
        nom=null;
        AnneeScolaire_id=null;
        Ecole_id=null;
        Niveau_id=null;
    }
    
    //constructeur surchargé
    public Classe(String p_id, String p_nom, String pasi, String pei, String pni){
        id=p_id;
        nom=p_nom;
        AnneeScolaire_id=pasi;
        Ecole_id=pei;
        Niveau_id=pni;
    }
    
    //getter et setter
    public String getId(){
        return id;
    }
    
     public String getNom(){
        return nom;
    }
     
     public String getPasi(){
        return AnneeScolaire_id;
    }
     
     public String getPei(){
        return Ecole_id;
    } 
    
     public String getPni(){
        return Niveau_id;
    }
     
     public void setId(String p_id){
         id=p_id;
     }
     
     public void setNom(String p_nom){
         nom=p_nom;
     }
     
     public void setPasi(String pasi){
         AnneeScolaire_id=pasi;
     }
     
     public void setPei(String pei){
         Ecole_id=pei;
     }
     
     public void setPni(String pni){
         Niveau_id=pni;
     }
     
     public String toString(){
        return("Classe n°id"+ getId()+", "+getNom()+", "+getPasi()+", "+getPei()+", "+getPni()+"/n");
     }
}   
