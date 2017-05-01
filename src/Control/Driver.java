/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Petugas;
import Model.Orang;
import java.util.*;
import Model.Anggota;
import Model.Barang;
import Model.Peminjaman;

/**
 *
 * @author Adli Rachman
 */
public class Driver {
    private ArrayList<Orang> listAnggota = new ArrayList<>();
    private ArrayList<Peminjaman> listPeminjaman = new ArrayList<>();
    private ArrayList<Peminjaman> listPengembalian = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Anggota a;
        
        Anggota a1 = new Anggota("Valen","Umayah","01");
        Anggota a2 = new Anggota("Kurnia","Kos Teladan","02");
        Petugas p1 = new Petugas("Ucup","Sumedang","0123");
        Petugas p2 = new Petugas("Gongsor","Purwokerto","0124");
        Barang b1 = new Barang("Sapu",45,"Tersedia");
        Barang b2 = new Barang("Kasur",30,"Tersedia");
        Barang b3 = new Barang("Gelas",90,"Tersedia");
        
        Peminjaman pin1 = new Peminjaman("P01",a1,"Pinjam","7 April 2017",p1);
        pin1.addBarangToPinjaman(b3,1);
        pin1.addBarangToPinjaman(b1,1);
        pin1.addBarangToPinjaman(b2,2);
        pin1.removeBarang(b3,1);
        
        Peminjaman pin2 = new Peminjaman("P02",a2,"Pinjam","8 April 2017",p2);
        pin2.addBarangToPinjaman(b1,1);
        pin2.addBarangToPinjaman(b2,1);
        pin2.addBarangToPinjaman(b1,1);
        a1.addPinjaman(pin1);
        a2.addPinjaman(pin2);
        a2.addPinjaman(pin1);
        
        
        
        a1.kembalikan(pin1,"9 April 2017");
        
        pin1.tampilPinjaman();
    }
    
}
