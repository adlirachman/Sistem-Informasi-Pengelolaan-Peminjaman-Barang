/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.*;
import View.*;

/**
 *
 * @author Adli Rachman
 */
public class ControllerMainMenu implements ActionListener{

    Aplikasi model;
    MainMenu view;
    Anggota ang = null;
    Peminjaman pem = null;
    Barang bar = null;
    
    public ControllerMainMenu(){
        view = new MainMenu();
        view.setVisible(true);
        view.addListener(this);
        model = new Aplikasi();
        view.setTitle("Sistem Peminjaman Barang");
        
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if(obj.equals(view.getBtnMenuAnggota())){
            new ControllerMenuAnggota();
            
        }
        else if(obj.equals(view.getBtnMenuBarang())){
            new ControllerMenuBarang();
            
        }
        else if(obj.equals(view.getBtnMenuPeminjaman())){
            new ControllerMenuPeminjaman();
            
        }
        else if(obj.equals(view.getBtnExit())){
            System.exit(0);
        }
    }
    
}
