package Model;
import java.util.*;
/**
 *
 * @author Adli Rachman
 */
public class Peminjaman {
    private ArrayList<Barang> pinjaman = new ArrayList<>();
    private ArrayList<Integer> jmlBarang = new ArrayList<>();
    private Anggota peminjam;
    private Petugas petugas;
    private String status;
    private String date;
    private String idPinjam;
    private ArrayList<Petugas> listPetugas = new ArrayList<>();
    private ArrayList<Anggota> listAnggota = new ArrayList<>();
 
   

    public Peminjaman(String idPinjam, Anggota peminjam, String status, String date,Petugas petugas) {
        this.idPinjam = idPinjam;
        this.peminjam = peminjam;
        this.status = status;
        this.date = date;
        this.petugas = petugas;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    public ArrayList<Integer> getJmlBarang() {
        return jmlBarang;
    }

    public void setJmlBarang(ArrayList<Integer> jmlBarang) {
        this.jmlBarang = jmlBarang;
    }

    public ArrayList<Petugas> getListPetugas() {
        return listPetugas;
    }

    public void setListPetugas(ArrayList<Petugas> listPetugas) {
        this.listPetugas = listPetugas;
    }

    public ArrayList<Anggota> getListAnggota() {
        return listAnggota;
    }

    public void setListAnggota(ArrayList<Anggota> listAnggota) {
        this.listAnggota = listAnggota;
    }

    
    
    public String getIdPinjam() {
        return idPinjam;
    }

    public void setIdPinjam(String idPinjam) {
        this.idPinjam = idPinjam;
    }

    public ArrayList<Barang> getPinjaman() {
        return pinjaman;
    }

    public void setPinjaman(ArrayList<Barang> pinjaman) {
        this.pinjaman = pinjaman;
    }
    

    public Anggota getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(Anggota peminjam) {
        this.peminjam = peminjam;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public void addBarangToPinjaman(Barang b, int jum){
        if(b.getJumlah() <= 0){
            System.out.println("Tidak ada stok barang");
        }else{
            pinjaman.add(b);
            b.pinjamBarang(b, jum);
            jmlBarang.add(jum);
        }
        
    }
    
    public void removeBarang(Barang b, int jum){
        if(pinjaman.isEmpty()){
             System.out.println(b.getNama()+" tidak ada di list");//cek barang ada apa ngga
        }else{
            pinjaman.remove(b);
            b.kembaliBarang(b, jum);
        }
    }

    void setTglPinjam(String date) {
        this.date=date;
    }
    
    public void addPetugas(Petugas p){
        listPetugas.add(p);
    }
    
    public void addAnggota(Anggota a){
        listAnggota.add(a);
    }
       
    public void tampilPinjaman(){
        System.out.println("ID Peminjaman = "+idPinjam);
        System.out.print(peminjam);
        System.out.println("Status = "+status);
        System.out.println("Date = "+date);
        System.out.println(petugas);
        System.out.println("Nama Barang : ");
        for(Barang b: pinjaman){
            System.out.println(b.getNama()+"..."+" buah");
        }
        
    }

}
