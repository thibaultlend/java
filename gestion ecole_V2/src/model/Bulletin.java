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
public class Bulletin {
    //attribut
    private String id;
    private String appreciation;
    private String trimestre_id;
    private String inscription_id;

    //constructeur
    public Bulletin(){
        id=null;
        appreciation=null;
        trimestre_id=null;
        inscription_id=null;
    }

    //constructeur surchargé
    public Bulletin (String p_id, String p_appreciation, String pti, String pii){
        id=p_id;
        appreciation=p_appreciation;
        trimestre_id=pti;
        inscription_id=pii;
    }
    
    //getter et setter
    public String getId(){
        return id;
    }
     
     public String getAppreciation(){
        return appreciation;
    }
     
    public String getTrimestre_id(){
        return trimestre_id;
    }
    
    public String getInscription_id(){
        return inscription_id;
    }
    
    public void setId(String p_id){
        id=p_id;
    }
    
    public void setAppreciation(String p_appreciation){
            appreciation=p_appreciation;
    }
    
     public void setTrimestre_id(String pti){
            trimestre_id=pti;
    }
     public void setInscription_id(String pii){
         inscription_id=pii;
     }
     
     public String ToString(){
        return("Bulletin n°id"+ getId()+", "+getAppreciation()+", "+getTrimestre_id()+", "+getInscription_id()+"/n");

     }
}
