/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Aplikasi;
import Model.Barang;
import View.detilPeminjaman;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Adli Rachman
 */
public class ControllerDetilPinjaman implements ActionListener{
    Aplikasi Model;
    detilPeminjaman view;
    Barang bar = null;
    ArrayList<Barang> listBarang = null;
    
    public ControllerDetilPinjaman() {
        view = new detilPeminjaman();
        view.setVisible(true);
        view.addListener(this);
        view.setTitle("Detil Peminjaman");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj.equals(view.getComboId())){
            
        }
        else if(obj.equals(view.getBtnKembali())){
            new ControllerMenuPeminjaman();
            view.dispose();
        }
    }
    
}
