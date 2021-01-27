package gilangpanjiwanengpati.latihanmvcjdbc.main;

import gilangpanjiwanengpati.latihanmvcjdbc.databse.KingBarbershopDatabase;
import gilangpanjiwanengpati.latihanmvcjdbc.error.PelangganException;
import gilangpanjiwanengpati.latihanmvcjdbc.view.PelangganView;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akmal
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
            SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    PelangganView pelanggan = new  PelangganView();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (PelangganException ex) {
                } catch (SQLException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
