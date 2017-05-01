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
public class ControllerMenuBarang implements ActionListener {

    Aplikasi model;
    menuBarang view;
    ArrayList<Barang> listBarang = null;
    Barang bar = null;
    
    public ControllerMenuBarang() {
        this.model = model;
        view = new menuBarang();
        view.setVisible(true);
        view.addListener(this);
        this.bar = bar;
        view.setTitle("Menu Barang");
    }
    
    public ControllerMenuBarang(Barang bar,Aplikasi Model) {
        this.model = model;
        view = new menuBarang();
        view.setVisible(true);
        view.addListener(this);
        this.bar = bar;
        view.setTitle("Menu Barang");
    }
    
    public ControllerMenuBarang(Aplikasi Model) {
        this.model = model;
        view = new menuBarang();
        view.setVisible(true);
        view.addListener(this);
        this.bar = bar;
        view.setTitle("Menu Barang");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj.equals(view.getBtnTambah())){
            new ControllerTambahBarang();
            view.dispose();
        }
        else if(obj.equals(view.getBtnEdit())){
            new ControllerEditBarang();
            view.dispose();
        }
        else if(obj.equals(view.getBtnHapus())){
            
        }
        else if(obj.equals(view.getBtnKembali())){
            
            view.dispose();
        }
    }
    
}
