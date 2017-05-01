/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Adli Rachman
 */
public class Barang {
    private String nama;
    private int jumlah;
    private String status;

    public Barang(String nama, int jumlah, String status) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
      
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    } 
    
    public void pinjamBarang(Barang b,int jum){
        this.jumlah = this.jumlah - jum;
    }
    
    public void kembaliBarang(Barang b, int jum){
        this.jumlah = this.jumlah + jum;
    }
    
    public void tampilBarang(){
        System.out.println("Nama Barang: "+nama);
        System.out.println("Jumlah: "+jumlah);
    }
}
