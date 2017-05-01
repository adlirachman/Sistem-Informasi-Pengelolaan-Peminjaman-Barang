/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.*;
import View.tambahPeminjaman;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Adli Rachman
 */
public class ControllerTambahPinjaman implements ActionListener{
    Aplikasi Model;
    tambahPeminjaman view;
    Barang bar;
    Anggota ang;
    Petugas pet;
    ArrayList<Barang> listBarang = null;

    public ControllerTambahPinjaman() {
        view = new tambahPeminjaman();
        view.setVisible(true);
        view.addListener(this);
        view.setTitle("Tambah Peminjaman");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj.equals(view.getBtnDone())){
            
        }
        else if(obj.equals(view.getBtnTambah())){
            
        }
        else if(obj.equals(view.getBtnKembali())){
            new ControllerMenuPeminjaman();
            view.dispose();
        }
        else if(obj.equals(view.getPetugas())){
            
        }
    }
    
}
