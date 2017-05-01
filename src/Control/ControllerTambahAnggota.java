/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Anggota;
import Model.Aplikasi;

import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Adli Rachman
 */
public class ControllerTambahAnggota implements ActionListener {
    Aplikasi model;
    tambahAnggota view;
    ArrayList<Anggota> listAnggota = new ArrayList<>();
    Anggota ang;
    String nama = null,alamat = null,id = null;

    public ControllerTambahAnggota(Anggota ang, Aplikasi model) {
    }

    public ControllerTambahAnggota() {
        model = new Aplikasi();
        view = new tambahAnggota();
        view.setVisible(true);
        view.addListener(this);
        this.ang = ang;
        view.setTitle("Tambah Anggota");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        nama = view.getNama();
        alamat = view.getAlamat();
        id = view.getId();
        if(obj.equals(view.getBtnAdd())){
            if(view.getId().equals("") && view.getNama().equals("") && view.getAlamat().equals("")){
                JOptionPane.showMessageDialog(view, "Data masih kosong", "Data kosong", 0);
            }else{
                try{
                model.addAnggota(nama,alamat,id);
                JOptionPane.showMessageDialog(view, "Data Berhasil diinputkan", "Berhasil", 1);
            } catch (Exception ex){
                JOptionPane.showMessageDialog(view, "Data Tidak Berhasil diinputkan", "Gagal Input", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }
        else if (obj.equals(view.getBtnKembali())){
            new ControllerMenuAnggota();
            view.dispose();
        }
    }

    
    
}
