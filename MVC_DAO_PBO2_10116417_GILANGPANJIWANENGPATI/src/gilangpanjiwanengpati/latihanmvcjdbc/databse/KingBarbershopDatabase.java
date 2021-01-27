/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gilangpanjiwanengpati.latihanmvcjdbc.databse;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import gilangpanjiwanengpati.latihanmvcjdbc.impl.PelangganDaoImpl;
import gilangpanjiwanengpati.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * NAMA        : GILANG PANJI WANENG PATI
 * KELAS       : PBO2
 * NIM         : 10116417
 */
public class KingBarbershopDatabase {
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws  SQLException{
     if (connection == null){
         MysqlDataSource dataSource = new MysqlDataSource();
         dataSource.setURL("jdbc:mysql://localhost:3306/barbersho");
         dataSource.setUser("root");
         dataSource.setPassword("");
         connection = dataSource.getConnection();
         
         
        
    }
    return connection;
    
}
   public static PelangganDao getPelangganDao() throws SQLException {
        if (pelangganDao==null) {
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
    }}