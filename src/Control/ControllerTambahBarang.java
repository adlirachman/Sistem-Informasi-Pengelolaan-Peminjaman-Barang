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
import javax.swing.JOptionPane;

/**
 *
 * @author Adli Rachman
 */
public class ControllerTambahBarang implements ActionListener {
    Aplikasi model;
    tambahBarang view;
    Barang bar = null;
    String nama,nomor;
    int qty;
    

    public ControllerTambahBarang() {
        model = new Aplikasi();
        view = new tambahBarang();
        view.setVisible(true);
        view.addListener(this);
        view.setTitle("Tambah Barang");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        nama = view.getNamaBarang();
        nomor = view.getNomorBarang();
        qty = view.getQty();
        Object obj = e.getSource();
        if(obj.equals(view.getBtnAdd())){
            if(view.getNamaBarang().equals("") && view.getNomorBarang().equals("")){
                JOptionPane.showMessageDialog(view, "Data masih kosong", "Data kosong", 0);
            }
            else{
                try{
                model.addBarang(nama, nomor, qty);
                JOptionPane.showMessageDialog(view, "Barang telah ditambahkan", "Berhasil", 1);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(view, "Data gagal ditambahkan", "Gagal", 0);
                }
            }
        }
        else if(obj.equals(view.getBtnKembali())){
            new ControllerMenuBarang();
            view.dispose();
        }
    }
    
}
