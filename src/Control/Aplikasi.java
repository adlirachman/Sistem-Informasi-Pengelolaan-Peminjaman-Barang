/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.*;
import Class.*;
/**
 *
 * @author Adli Rachman
 */
public class Aplikasi {
    private ArrayList<Peminjaman> listPeminjaman;
    private ArrayList<Anggota> listAnggota;
    
    
    public void MainMenu(){
        System.out.println("Main Menu");
        System.out.println("1. Anggota");
        System.out.println("2. Petugas");
        System.out.println("3. Barang");
        System.out.println("4. Peminjaman");
        System.out.println("5. Pengembalian");
        System.out.println("0. Exit");
        System.out.println("Pilihan anda:");
    }
    
    public void menuAnggota(){
        System.out.println("Menu Anggota");
        System.out.println("1. Tambah");
        System.out.println("2. Remove");
        System.out.println("3. Lihat Anggota");
        System.out.println("4. Edit Profil");
        System.out.println("0. Kembali");
        System.out.println("Pilihan anda:");
    }
    
    public void menuPetugas(){
        System.out.println("Menu Petugas");
        System.out.println("1. Tambah");
        System.out.println("2. Remove");
        System.out.println("3. Lihat Petugas");
        System.out.println("4. Edit Profil");
        System.out.println("0. Kembali");
        System.out.println("Pilihan anda:");
    }
    
    public void menuBarang(){
        System.out.println("Menu Barang");
        System.out.println("1. Tambah");
        System.out.println("2. Remove");
        System.out.println("3. Lihat Barang");
        System.out.println("4. Edit Data Barang");
        System.out.println("0. Kembali");
        System.out.println("Pilihan anda:");
    }
    
    public void menuPeminjaman(){
        System.out.println("Menu Peminjaman");
        System.out.println("1. Tambah Peminjaman");
        System.out.println("2. Remove Peminjaman");
        System.out.println("3. Lihat Peminjaman");
        System.out.println("4. Tambah Barang");
        System.out.println("5. Remove Barang");
        System.out.println("0. Kembali");
        System.out.println("Pilihan anda:");
    }
    
    public void menuPengembalian(){
        System.out.println("Menu Pengembalian");
        System.out.println("1. Kembalikan");
        System.out.println("0. Kembali");
        System.out.println("Pilihan anda:");
    }
}
