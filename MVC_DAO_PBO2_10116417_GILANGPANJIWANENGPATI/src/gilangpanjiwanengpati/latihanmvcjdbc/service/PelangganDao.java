/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gilangpanjiwanengpati.latihanmvcjdbc.service;

import gilangpanjiwanengpati.latihanmvcjdbc.entity.Pelanggan;
import gilangpanjiwanengpati.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * NAMA        : GILANG PANJI WANENG PATI
 * KELAS       : PBO2
 * NIM         : 10116417
 */
public interface PelangganDao {
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    public void deletePelanggan(Integer id) throws PelangganException;
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    public Pelanggan getelanggan(String email) throws PelangganException;    
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
