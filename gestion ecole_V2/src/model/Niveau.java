/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.logging.Logger;

/**
 *
 * @author nmalk
 */
public class Niveau {
    
    private String id;
    private String nom;
    
    //constructeur par defaut
    public Niveau(){
     id=null;
     nom=null;
    }
    
    //constructeur surchargé 
    public Niveau (String identifiant, String name){
        id=identifiant;
        nom=name;
    }
    
    //getter et setter
    public String getId(){
        return id;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setId (String identifiant){
        id=identifiant;
    }
    
    public void setNom(String name){
        nom=name;
    }
     public String toString(){
        return("Niveau n°id"+ getId()+", "+getNom()+"/n");
    }
    
}
