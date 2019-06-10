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
public class Trimestre {

    //attribut
    private String id;
    private int numero;
    private int debut;
    private int fin;
    private String AnneeScolaire_id;
    
    //Constructeur
    public Trimestre() {
        id = null;
        numero = 0;
        debut = 0;
        fin = 0;
        AnneeScolaire_id =null;
    }
    
    //constructeur surchargé
    public Trimestre(String p_id, int p_numero, int p_debut, int p_fin, String pasi) {
        id = p_id;
        numero = p_numero;
        debut = p_debut;
        fin = p_fin;
        AnneeScolaire_id = pasi;
    }
    
    //getter et setter  
    public String getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public int getDebut() {
        return debut;
    }

    public int getFin() {
        return fin;
    }

    public String getPasi() {
        return AnneeScolaire_id;
    }
        
    public void setId(String p_id) {
        id = p_id;
    }

    public void setNumero(int p_numero) {
        numero = p_numero;
    }

    public void setDebut(int p_debut) {
        debut = p_debut;
    }

    public void setFin(int p_fin) {
        fin = p_fin;
    }

    public void setPasie(String pasi) {
        AnneeScolaire_id = pasi;
    }
}