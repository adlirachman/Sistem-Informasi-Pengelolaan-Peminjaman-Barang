/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Peminjaman;
import Model.Anggota;
import Model.Barang;
import Model.Petugas;
import java.util.*;
/**
 *
 * @author Adli Rachman
 */
public class Aplikasi {
    private ArrayList<Peminjaman> listPeminjaman = null;
    private ArrayList<Anggota> listAnggota = null;
    private ArrayList<Barang> listBarang = null;
    private ArrayList<Petugas> listPetugas = null;
    private ArrayList<Peminjaman> listPengembalian = null;
    
    
    public Aplikasi(){
        listPeminjaman = new ArrayList<>();
        listAnggota = new ArrayList<>();
        listBarang = new ArrayList<>();
        listPetugas = new ArrayList<>();
        listPengembalian = new ArrayList<>();
    }
    
    //Anggota
    public void addAnggota(Anggota a){
        listAnggota.add(a);
    }
    
    public void removeAnggota(Anggota a){
        listAnggota.remove(a);
    }
    
    public Anggota getIdAnggota(int id){
        return listAnggota.get(id);
    }
    
//    public Anggota getAnggota(String no){
//        for (Anggota : listAnggota){
//            if(a.getNoAnggota() == no){
//                return a;
//            }
//        }
////        Anggota a = connection
////          return a;
//    }
    
    
    //Petugas
    public void addPetugas(Petugas p){
        listPetugas.add(p);
    }
    
    public void removePetugas(Petugas p){
        listPetugas.remove(p);
    }
    
    //Peminjaman
    public void addPeminjaman(Peminjaman pe){
        listPeminjaman.add(pe);
    }
    
    public void removePeminjaman(Peminjaman pe){
        listPeminjaman.remove(pe);
    }
    
    //Pengembalian
    public void addPengembalian(Peminjaman pb){
        listPengembalian.add(pb);
    }
    
    //Barang
    public void addBarang(Barang b){
        listBarang.add(b);
    }
    
    public void removeBarang(Barang b){
        listBarang.remove(b);
    }
    
    
}
