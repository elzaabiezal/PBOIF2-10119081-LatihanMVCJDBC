/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.muhammadelza.latihanmvcjdbc.service;

import edu.muhammadelza.latihanmvcjdbc.entity.Pelanggan;
import edu.muhammadelza.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author Elza Abiezal
 * Nama     : Muhammad Elza Abiezal
 * Kelas    : IF-2
 * NIM      : 10119081
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
