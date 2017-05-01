/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.AplikasiConsole;
import Model.*;
import View.tambahPeminjaman;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Adli Rachman
 */
public class ControllerTambahPinjaman implements ActionListener{
    Aplikasi model;
    tambahPeminjaman view;
    Barang bar;
    Anggota ang;
    String pet;
    ArrayList<Barang> listBarang = null;
    String id,nama,tanggal;

    public ControllerTambahPinjaman() {
        model = new Aplikasi();
        view = new tambahPeminjaman();
        view.setVisible(true);
        view.addListener(this);
        view.setTitle("Tambah Peminjaman");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        id = view.getIDPinjam();
        nama = view.getNamaPeminjam();
        tanggal = view.getTanggalPinjam();
        
        if(obj.equals(view.getBtnDone())){
            if(id.equals("") && nama.equals("") && tanggal.equals("")){
                JOptionPane.showMessageDialog(view, "Data masih kosong", "Data kosong", 0);

            }else{
                try{
                    model.addPeminjaman(id,nama,tanggal);
                    JOptionPane.showMessageDialog(view, "Data berhasil diinput", "Berhasil", 1);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(view, "Terjadi kesalahan", "Kesalahan", 0);
                }
            }
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
