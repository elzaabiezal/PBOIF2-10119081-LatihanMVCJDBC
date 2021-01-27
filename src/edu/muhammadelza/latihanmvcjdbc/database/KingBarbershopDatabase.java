/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.muhammadelza.latihanmvcjdbc.database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.muhammadelza.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.muhammadelza.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;

/**
 *
 * @author Elza Abiezal
 * Nama     : Muhammad Elza Abiezal
 * Kelas    : IF-2
 * NIM      : 10119081
 */
public class KingBarbershopDatabase {
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
        if (connection==null) {
    
          MysqlDataSource  dataSource = new MysqlDataSource();
         dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
         dataSource.setUser("root");
         dataSource.setPassword("");
         connection = (Connection) dataSource.getConnection();

    }
        
        
    return connection;
}
 public static PelangganDao getPelangganDao() throws SQLException{
     
    if(pelangganDao==null) {
        pelangganDao = new PelangganDaoImpl(getConnection());
        
    }
    return pelangganDao;
 }
}