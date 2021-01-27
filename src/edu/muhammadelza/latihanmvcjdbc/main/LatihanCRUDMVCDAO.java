/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.muhammadelza.latihanmvcjdbc.main;

import edu.muhammadelza.latihanmvcjdbc.database.KingBarbershopDatabase;
import java.sql.SQLException;

/**
 *
 * @author Elza Abiezal
 * Nama     : Muhammad Elza Abiezal
 * Kelas    : IF-2
 * NIM      : 10119081
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        KingBarbershopDatabase.getConnection();
    }
    
}
