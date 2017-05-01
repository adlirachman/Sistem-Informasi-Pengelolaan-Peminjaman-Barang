/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.*;

/**
 *
 * @author Adli Rachman
 */
public class Anggota extends Orang{
    private String noAnggota;
    private ArrayList<Peminjaman> riwayatPinjaman = new ArrayList<>();
    private Peminjaman p;
    
    public Anggota(String nama, String alamat, String noAnggota){
        super(nama, alamat);
        this.noAnggota = noAnggota;
        
    }

    public String getNoAnggota() {
        return noAnggota;
    }
    
    @Override
    public String getNama() {
        return super.getNama();
    }
    
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }

    @Override
    public void setAlamat(String alamat) {
        super.setAlamat(alamat);
    }
    
    // create pinjaman dan kembalikan pinjaman
    
    public void addPinjaman(Peminjaman e){
        riwayatPinjaman.add(e);
    }  
      
    public void kembalikan(Peminjaman e,String date){
//        if(riwayatPinjaman.isEmpty()){
//            riwayatPinjaman.remove(id); //cek array list
//        }
        e.setStatus("Dikembalikan");
        e.setDate(date);
    }
    
    public void tampilAnggota(){
        System.out.println("Nama: "+super.getNama());
        System.out.println("Alamat: "+super.getAlamat());
        System.out.println("No Anggota: "+noAnggota);
        System.out.println("Kode Peminjaman: ");
        for(Peminjaman e: riwayatPinjaman){
            System.out.println(e.getIdPinjam()+" : "+e.getStatus()+" pada tanggal "+e.getDate());
        }
    }
    @Override
    public String toString(){
        String nama = "Nama Anggota = " + super.getNama();
        String noanggota = "Nomor Anggota = " + this.noAnggota;
        String alamat = "Alamat = " + super.getAlamat();
        
        return nama + '\n' + noanggota + '\n' + alamat + '\n';
    }
}
