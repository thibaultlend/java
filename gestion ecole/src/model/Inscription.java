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
public class Inscription {
    //attribut
    private String id;
    private String Classe_id;
    private String Personne_id;
    
    //constructeur
    public Inscription()
    {
        id=null;
        Classe_id=null;
        Personne_id=null;
    }
    
    //constructeur surchargé
    public Inscription(String p_id, String pci, String ppi) {
        id = p_id;
        Classe_id = pci;
        Personne_id = ppi;
    }

    //getter et setter
    public String getId() {
        return id;
    }

    public String getPci() {
        return Classe_id;
    }

    public String getPpi() {
        return Personne_id;
    }

    public void setId(String p_id) {
        id = p_id;
    }

    public void setPci(String pci) {
        Classe_id = pci;
    }

    public void setPpi(String ppi) {
        Personne_id = ppi;
    }
    
     public String ToString(){
        return("Inscription n°id"+ getId()+", "+getPci()+", "+getPpi()+"/n");
     }
}
