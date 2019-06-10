/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author nmalk
 */
public class Personne {
    
    private String id;
    private String nom;
    private String prenom;
    private boolean type;
    private String login;
    private String mdp;

    //constructeur par defaut
    public Personne (){
        id = null;
        nom = null;
        prenom = null;
        type = false;
        login = null;
        mdp = null;
    }
    
    /*constructeur surchargé 1
    l'id, le nom, le prenom, le type 
    @param identifiant
    @param last name
    @param firstname
    @param t
    */
    public Personne (String identifiant, String lastname, String firstname, String p_type, String p_login, String p_mdp){
        id = identifiant;
        nom = lastname;
        prenom= firstname;
        login = p_login;
        mdp=p_mdp;
    }
    

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;    
    }

    public String getLogin(){
        return login;
    }
    
    public String getmdp(){
        return mdp;
    }
    
    public boolean getType() {
        return type;
    }

    public void  setId(String identifiant) {
        id=identifiant;
    }

    public void  setNom(String lastname) {
        nom=lastname;
    }

    public void  setPrenom(String firstname) {
        prenom=firstname;
    }

    public void setLogin(String p_login){
        login=p_login;
    }
    
    public void setmdp(String p_mdp){
        mdp=p_mdp;
    }
    
    public void  setType(boolean p_type) {
        type = p_type;
    }
    
    public String toString(){
        return("Personne n°id"+ getId()+", "+getNom()+" "+getPrenom()+" "+getType()+"/n");
    }
    
}
