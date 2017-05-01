/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.AplikasiConsole;
import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Adli Rachman
 */
public class ControllerMenuAnggota implements ActionListener {
    AplikasiConsole model;
    menuAnggota view;
    ArrayList<Anggota> listAnggota = null;
    Anggota ang = null;
    
    public ControllerMenuAnggota(Anggota ang,AplikasiConsole model) {
        this.model = model;
        view = new menuAnggota();
        view.setVisible(true);
        view.addListener(this);
        this.ang = ang;
        view.setTitle("Menu Anggota");
        
//        this.listAnggota = model.get
        
    }
    
    public ControllerMenuAnggota(AplikasiConsole model){
        this.model = model;
        view = new menuAnggota();
        view.setVisible(true);
        view.addListener(this);
        this.ang = ang;
        view.setTitle("Menu Anggota");
    }

    public ControllerMenuAnggota() {
        this.model = model;
        view = new menuAnggota();
        view.setVisible(true);
        view.addListener(this);
        this.ang = ang;
        view.setTitle("Menu Anggota");
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj.equals(view.getBtnTambah())){
            new ControllerTambahAnggota();
            view.dispose();
        }
        else if (obj.equals(view.getBtnHapus())){
            
        }
        else if(obj.equals(view.getBtnEdit())){
            new ControllerEditAnggota();
            view.dispose();
        }
        else if(obj.equals(view.getBtnKembali())){
            
            view.dispose();
        }
    }

    
    
}
