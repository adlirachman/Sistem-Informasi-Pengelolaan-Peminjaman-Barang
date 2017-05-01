/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Aplikasi;
import Model.Barang;
import View.editBarang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Adli Rachman
 */
public class ControllerEditBarang implements ActionListener{
    Aplikasi model;
    editBarang view;
    ArrayList<Barang> listBarang = null;
    Barang bar = null;

    public ControllerEditBarang() {
        this.model = model;
        view = new editBarang();
        view.setVisible(true);
        view.addListener(this);
        this.bar = bar;
        view.setTitle("Edit Data Barang");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj.equals(view.getBtnCari())){
            
        }
        else if(obj.equals(view.getBtnSimpan())){
            
        }
        else if(obj.equals(view.getBtnKembali())){
            new ControllerMenuBarang();
            view.dispose();
        }
    }
    
}
