package sistem.informasi.pengelolaan.peminjaman.barang;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adli Rachman
 */
public class Orang {
    private String nama;
    private Date tglLahir;
    private String JnsKel;
    private String tmptLahir;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getJnsKel() {
        return JnsKel;
    }

    public void setJnsKel(String JnsKel) {
        this.JnsKel = JnsKel;
    }

    public String getTmptLahir() {
        return tmptLahir;
    }

    public void setTmptLahir(String tmptLahir) {
        this.tmptLahir = tmptLahir;
    }
    
    
}
