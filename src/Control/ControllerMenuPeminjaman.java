/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Adli Rachman
 */
public class ControllerMenuPeminjaman implements ActionListener{
    Aplikasi model;
    menuPeminjaman view;
    ArrayList<Peminjaman> listPeminjaman = null;
    Peminjaman pem = null;

    public ControllerMenuPeminjaman() {
        this.model = model;
        view = new menuPeminjaman();
        view.setVisible(true);
        view.addListener(this);
        this.pem = pem;
        view.setTitle("Menu Peminjaman dan Pengembalian");
    }
    
    public ControllerMenuPeminjaman(Aplikasi model) {
        this.model = model;
        view = new menuPeminjaman();
        view.setVisible(true);
        view.addListener(this);
        this.pem = pem;
        view.setTitle("Menu Peminjaman dan Pengembalian");
    }
    
    public ControllerMenuPeminjaman(Peminjaman pem, Aplikasi model) {
        this.model = model;
        view = new menuPeminjaman();
        view.setVisible(true);
        view.addListener(this);
        this.pem = pem;
        view.setTitle("Menu Peminjaman dan Pengembalian");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj.equals(view.getBtnTambahPinjaman())){
            new ControllerTambahPinjaman();
            view.dispose();
        }
        else if(obj.equals(view.getBtnTambahBarang())){
            new ControllerTambahBarangKePinjaman();
            view.dispose();
        }
        else if(obj.equals(view.getBtnDetilPinjaman())){
            new ControllerDetilPinjaman();
            view.dispose();
        }
        else if(obj.equals(view.getBtnKembalikan())){
            
        }
        else if(obj.equals(view.getBtnKembali())){
            view.dispose();
        }
    }
    
}
