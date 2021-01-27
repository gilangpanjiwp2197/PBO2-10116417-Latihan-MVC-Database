/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gilangpanjiwanengpati.latihanmvcjdbc.event;

import gilangpanjiwanengpati.latihanmvcjdbc.entity.Pelanggan;
import gilangpanjiwanengpati.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * NAMA        : GILANG PANJI WANENG PATI
 * KELAS       : PBO2
 * NIM         : 10116417
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);
 
    
}