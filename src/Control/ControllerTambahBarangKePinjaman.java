/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Aplikasi;
import Model.Barang;
import View.tambahBarang;
import View.tambahBarangKePinjaman;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Adli Rachman
 */
public class ControllerTambahBarangKePinjaman implements ActionListener{
    Aplikasi Model;
    tambahBarangKePinjaman view;
    Barang bar = null;
    ArrayList<Barang> listBarang = null;
    ArrayList<Barang> listBarangPinjam = null;

    public ControllerTambahBarangKePinjaman() {
        view = new tambahBarangKePinjaman();
        view.setVisible(true);
        view.addListener(this);
        view.setTitle("Tambah Barang ke Peminjaman");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj.equals(view.getComId())){
            
        }
        else if(obj.equals(view.getBtnAdd())){
            
        }
        else if(obj.equals(view.getBtnHapus())){
            
        }
        else if(obj.equals(view.getBtnKembali())){
            new ControllerMenuPeminjaman();
            view.dispose();
        }
    }
    
}
