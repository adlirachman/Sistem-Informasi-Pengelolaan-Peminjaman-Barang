/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Aplikasi;
import Model.Barang;
import View.tambahBarang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adli Rachman
 */
public class ControllerTambahBarang implements ActionListener {
    Aplikasi Model;
    tambahBarang view;
    Barang bar = null;
    

    public ControllerTambahBarang() {
        view = new tambahBarang();
        view.setVisible(true);
        view.addListener(this);
        view.setTitle("Tambah Barang");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj.equals(view.getBtnAdd())){
            
        }
        else if(obj.equals(view.getBtnKembali())){
            new ControllerMenuBarang();
            view.dispose();
        }
    }
    
}
