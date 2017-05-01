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
import java.util.ArrayList;

/**
 *
 * @author Adli Rachman
 */
public class ControllerTambahAnggota implements ActionListener {
    Aplikasi model;
    tambahAnggota view;
    ArrayList<Anggota> listAnggota = null;
    Anggota ang = null;

    public ControllerTambahAnggota(Anggota ang, Aplikasi model) {
    }

    public ControllerTambahAnggota() {
        this.model = model;
        view = new tambahAnggota();
        view.setVisible(true);
        view.addListener(this);
        this.ang = ang;
        view.setTitle("Tambah Anggota");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj.equals(view.getBtnAdd())){
            
        }
        else if (obj.equals(view.getBtnKembali())){
            new ControllerMenuAnggota();
            view.dispose();
        }
    }

    
    
}
