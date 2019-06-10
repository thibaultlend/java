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
public class AnnéeScolaire {
    //attribut
    private String id;
    private String year;
    
    //constructeur 
    public AnnéeScolaire(){
        id=null;
        year="2018-2019";
    }
    
    //constructeur surchargé
    public AnnéeScolaire(String p_id, String p_year){
        id=p_id;
        year=p_year;
    }
    
    //getter et setter
    public String getId(){
        return id;
    }
    
    public String getYear(){
    return year;
    }
    
    
    public void setId(String p_id){
        id=p_id;
    }
    
    public void SetYear(String p_year){
        year=p_year;
    }
    
    public String toString(){    
        return("Année Scolaire n°id" +getId()+ ", "+getYear()+"/n");
    }
}
