/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.Connection;


/**
 *
 * @author nmalk
 * @param <T>
 */
public abstract class DAO<T> {
    
    protected Connexion connect = null;
    
    public DAO(Connexion conn){
        connect=conn;
    }
    
    /**
     * methode créer
     * @param  obj
     * @return boolean
     */
     public abstract boolean create(T obj);

    /**
    * Méthode pour effacer
    * @param obj
    * @return boolean 
    */
    public abstract boolean delete(T obj);

    /**
    * Méthode de mise à jour
    * @param obj
    * @return boolean
    */
    public abstract boolean update(T obj);
  
    /**
    * Méthode de recherche des information
    * @param id
    * @return T
    */
    public abstract T find(int id);
}
