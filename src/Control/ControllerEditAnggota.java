/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Anggota;
import Model.Aplikasi;
import View.editAnggota;
import View.menuAnggota;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Adli Rachman
 */
public class ControllerEditAnggota implements ActionListener{
    Aplikasi model;
    editAnggota view;
    ArrayList<Anggota> listAnggota = null;
    Anggota ang = null;
    
    public ControllerEditAnggota(Anggota ang, Aplikasi model) {
        model = new Aplikasi();
        view = new editAnggota();
        view.setVisible(true);
        view.addListener(this);
        this.ang = ang;
        view.setTitle("Edit Data Anggota");
    }

    public ControllerEditAnggota() {
        this.model = model;
        view = new editAnggota();
        view.setVisible(true);
        view.addListener(this);
        this.ang = ang;
        view.setTitle("Edit Data Anggota");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object obj = e.getSource();
        if(obj.equals(view.getBtnCari())){
//            for(int i = 0; i<= model.)
//            if(model.getIdAnggota(0) == ){
//                
//            }
        }
        else if(obj.equals(view.getBtnSimpan())){
            
        }
        else if(obj.equals(view.getBtnKembali())){
            new ControllerMenuAnggota();
            view.dispose();
        }
    }

    
}
