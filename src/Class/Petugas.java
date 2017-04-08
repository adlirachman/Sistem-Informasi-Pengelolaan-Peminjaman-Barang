/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Adli Rachman
 */
public class Petugas extends Orang{
    private final String nip;
    
    public Petugas(String nama, String alamat, String nip){
        super(nama, alamat);
        this.nip = nip;
    }
    
    public String getNip() {
        return nip;
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
    
    public void tampilPetugas(){
        System.out.println("Nama: "+super.getNama());
        System.out.println("Alamat: "+super.getAlamat());
        System.out.println("NIP: "+nip);
    }
    
       
    @Override
    public String toString(){
        String nama = "Nama Petugas = " + super.getNama();
        String nip = "NIP = " + this.nip;
        String alamat = "Alamat = " + super.getAlamat();
        
        return nama + '\n' + nip + '\n' + alamat + '\n';
    }
}
