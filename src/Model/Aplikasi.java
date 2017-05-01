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
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Adli Rachman
 */
public class Aplikasi {
    private ArrayList<Peminjaman> listPeminjaman;
    private ArrayList<Anggota> listAnggota;
    private ArrayList<Barang> listBarang;
    private ArrayList<Petugas> listPetugas;
    private ArrayList<Peminjaman> listPengembalian;
    
    
    public Aplikasi(){
        listPeminjaman = new ArrayList<>();
        listAnggota = new ArrayList<>();
        listBarang = new ArrayList<>();
        listPetugas = new ArrayList<>();
        listPengembalian = new ArrayList<>();
    }
    
    //Anggota
    public void addAnggota(String nama,String alamat,String id){
        listAnggota.add(new Anggota(nama, alamat, nama));
        
    }
    
    public void removeAnggota(Anggota a){
        listAnggota.remove(a);
    }
    
//    public Anggota getIdAnggota(String id){
//        return listAnggota.contains(id);
//    }
    
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
    public void addPeminjaman(String idPinjam, String peminjam, String date){
        listPeminjaman.add(new Peminjaman(idPinjam,peminjam,date));
    }
    
    public void removePeminjaman(Peminjaman pe){
        listPeminjaman.remove(pe);
    }
    
    public void listPeminjaman(){
        for(Peminjaman p : listPeminjaman){
            p.tampilPinjaman();
        }
    }
    
    //Pengembalian
    public void addPengembalian(Peminjaman pb){
        listPengembalian.add(pb);
    }
    
    //Barang
    public void addBarang(String namaBarang,String nomorBarang,int qty){
        listBarang.add(new Barang(namaBarang,qty,nomorBarang));
    }
    
    public void removeBarang(Barang b){
        listBarang.remove(b);
    }
    
    public void listBarang(){
        for(Barang b : listBarang){
            b.tampilBarang();
        }
    }
    
    
}
