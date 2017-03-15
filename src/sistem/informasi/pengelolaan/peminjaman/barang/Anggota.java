/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.pengelolaan.peminjaman.barang;

/**
 *
 * @author Adli Rachman
 */
public class Anggota extends Orang{
    private String noAnggota;
    private Peminjaman[] riwayatPinjaman;
    
    public Anggota(String nama, String alamat, String noAnggota){
        super(nama, alamat);
        this.noAnggota = noAnggota;
        riwayatPinjaman = new Peminjaman[20]; // Max data di riwayatPeminjaman = 20
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
    
    public void createPinjaman(String date){
        Peminjaman p = new Peminjaman();
        p.setTglPinjam(date);
        
        for(int i = 0; i <= riwayatPinjaman.length; i++){
            if(riwayatPinjaman[i] == null){
                riwayatPinjaman[i] = p;
                break;
            }
        }
    }
    
    public void addBarangToPinjaman(int id, Barang b){
        if(riwayatPinjaman[id] != null){
            riwayatPinjaman[id].addPinjaman(b);
        }
    }
    
    public void kembalikan(int id){
        riwayatPinjaman[id] = null;
    }
    
    public String toString(){
        String nama = "Nama Anggota = " + super.getNama();
        String noanggota = "Nomor Anggota = " + this.noAnggota;
        String alamat = "Alamat = " + super.getAlamat();
        
        return nama + '\n' + noanggota + '\n' + alamat + '\n';
    }
}
