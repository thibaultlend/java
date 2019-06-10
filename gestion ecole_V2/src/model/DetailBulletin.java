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
public class DetailBulletin {
    //attribut
    private String id;
    private String appreciation;
    private String bulletin_id;
    private String enseignement_id;

    //constructeur 
    public DetailBulletin(){
        id=null;
        appreciation=null;
        bulletin_id=null;
        enseignement_id=null;
    }
    
    //constructeur surchargée
    public DetailBulletin(String p_id, String pa, String pbi, String pei){
        id=p_id;
        appreciation=pa;
        bulletin_id=pbi;
        enseignement_id=pei;
    }
    
    //getter et setter
    public String getId(){
        return id;
    }
    
    public String getPa(){
        return id;
    }
    
    public String getPbi(){
        return id;
    }
    
    public String getPei(){
        return id;
    }
    
    public void setId(String p_id){
        id = p_id;
    }
     
    public void setPa(String pa){
        appreciation = pa;
    }
    
    public void setPbi(String pbi){
        bulletin_id = pbi;
    }
    
    public void setPei(String pei){
        enseignement_id = pei;
    }
    
    public String ToString(){
        return("Detail Bulletin n°id"+ getId()+", "+getPa()+", "+getPbi()+", "+getPei()+"/n");
     }
}
