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
public class Ecole {
    //attribut
    private String id;
    private String nom;
    
    //Constructeur
    public Ecole()
    {
        id=null;
        nom=null;  
    }
    
    //constructeur surchargé
    public Ecole(String p_id, String p_nom)
    {
        id = p_id;
        nom = p_nom;   
    }

    //getter et setter
    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
        
    public void setId(String p_id) {
        id = p_id;
    }

    public void setNom(String p_nom) {
        nom = p_nom;
    }
}
