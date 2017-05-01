/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;
import Class.*;
/**
 *
 * @author Adli Rachman
 */
public class AplikasiConsole {
    private ArrayList<Peminjaman> listPeminjaman;
    private ArrayList<Anggota> listAnggota;
    private ArrayList<Barang> listBarang;
    
    
    public void MainMenu(){
        System.out.println("Main Menu");
        System.out.println("1. Anggota");
        System.out.println("2. Barang");
        System.out.println("3. Peminjaman dan Pengembalian");
        System.out.println("0. Exit");
        System.out.println("Pilihan anda:");
    }
    
    public void menuAnggota(){
        System.out.println("Menu Anggota");
        System.out.println("1. Tambah");
        System.out.println("2. Remove");
        System.out.println("3. Edit Profil");
        System.out.println("0. Kembali");
        System.out.println("Pilihan anda:");
    }
    
    
    public void menuBarang(){
        System.out.println("Menu Barang");
        System.out.println("1. Tambah");
        System.out.println("2. Remove");
        System.out.println("3. Edit Data Barang");
        System.out.println("0. Kembali");
        System.out.println("Pilihan anda:");
    }
    
    public void menuPeminjaman(){
        System.out.println("Menu Peminjaman");
        System.out.println("1. Tambah Peminjaman");
        System.out.println("2. Lihat Detil Peminjaman");
        System.out.println("3. Tambah Barang");
        System.out.println("0. Kembali");
        System.out.println("Pilihan anda:");
    }
}
