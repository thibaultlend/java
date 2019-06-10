/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import model.AnnéeScolaire;

/**
 *
 * @author nmalk
 */
public class AnnéeScolaireDAO extends DAO<AnnéeScolaire>{

    public AnnéeScolaireDAO(Connexion conn) {
        super(conn);
    }

    @Override
    public boolean create(AnnéeScolaire obj) {
        return false;
    }

    @Override
    public boolean delete(AnnéeScolaire obj) {
        return false;
    }

    @Override
    public boolean update(AnnéeScolaire obj) {
        return false;
    }

    @Override
    public AnnéeScolaire find(int id) {
        AnnéeScolaire year = new AnnéeScolaire();
        
       try {
            ResultSet result = this.connect.getConn().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM AnneeScolaire WHERE AnneeScolaire_id =" + id);
            if(result.first())
                System.out.println("Find at least one SchoolYear in the database");
                year = new AnnéeScolaire(
                       result.getInt("AnneeScolaire_id"),
                        result.getString("nom_anneScolaire")
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return year;
    }
    
     @Override
    public boolean delete(AnnéeScolaire obj) {        
         try {
            // prefer prepareStatement as statement to avoid SQL injection
            PreparedStatement statement = connect.prepareStatement(
                    "DELETE FROM AnneeScolaire WHERE id=?"
            );
            //insert param to change the ? into data
            statement.setObject(1, obj.getId(), Types.INTEGER);
            statement.executeUpdate(); //execute update for change in DB and executeQuery for select

    } catch (SQLException e) {
      e.printStackTrace();
    }
        return true;
    }
    
}
