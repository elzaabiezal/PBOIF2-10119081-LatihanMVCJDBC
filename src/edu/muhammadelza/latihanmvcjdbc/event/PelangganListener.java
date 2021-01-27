/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.muhammadelza.latihanmvcjdbc.event;

import edu.muhammadelza.latihanmvcjdbc.entity.Pelanggan;
import edu.muhammadelza.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Elza Abiezal
 * Nama     : Muhammad Elza Abiezal
 * Kelas    : IF-2
 * NIM      : 10119081
 */
public interface PelangganListener {
    
    public void onChange (PelangganModel model);
    
    public void onInsert (Pelanggan model);
    
    public void onDelete ();
    
    public void onUpdate (Pelanggan model);
    
    
}
