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
public class Enseignement {
    //attribut
    private String id;
    private String Classe_id;
    private String Discipline_id;
    private String Personne_id;

    //constructeur 
    public Enseignement(){
        id = null;
        Discipline_id = null;
        Classe_id = null;
        Personne_id = null;
    }

    //constructeur surchargé
    public Enseignement(String p_id, String pci, String pdi, String ppi){
        id = p_id;
        Discipline_id = pdi;
        Classe_id = pci;
        Personne_id = ppi;
    }

    
    //getter et setter
    public String getId(){
        return id;
    }
    
    public String getPci(){
        return Classe_id;
    }
     
    public void setId(String p_id){
        id  = p_id;
    }
    
    public String getPdi(){
        return Discipline_id;
    }
    
    public String getPpi(){
        return Personne_id;
    }
    
    public void setPci(String pci){
        Classe_id = pci;
    }

    public void setPdi(String pdi){
        Discipline_id = pdi;
    }

    public void setPpi(String ppi){
        Personne_id = ppi;
    }

     public String ToString(){
        return("Enseignement n°id"+ getId()+", "+getPdi()+", "+getPci()+", "+getPpi()+"/n");
     }
}
