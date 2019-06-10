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
public class Evaluation {
    //attribut
    private String id;
    private int note;
    private String appreciation;
    private String DetailBulletin_id;
    
    //constructeur
    public Evaluation(){
        id=null;
        note=0;
        appreciation=null;
        DetailBulletin_id=null;
    }

    //constructeur surchargée
    public Evaluation(String p_id, int p_note, String pa, String pdbi) {
        id = p_id;
        note = p_note;
        appreciation = pa;
        DetailBulletin_id = pdbi;
    }

    //getter et setter
    public String getId() {
        return id;
    }

    public int getNote() {
        return note;
    }

    public String getPa() {
        return appreciation;
    }

    public String getPdbi() {
        return DetailBulletin_id;
    }

    public void setId(String p_id) {
        id = p_id;
    }

    public void setNote(int p_note) {
        note = p_note;
    }

    public void setPa(String pa) {
        appreciation = pa;
    }

    public void setPdbi(String pdbi) {
        DetailBulletin_id = pdbi;
    }
    
     public String ToString(){
        return("Evaluation n°id"+ getId()+", "+getPa()+", "+getPdbi()+"/n");
     }
}
