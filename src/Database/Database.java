/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Adli Rachman
 */
public class Database {
    
    private String server = "jdbc:mysql://localhost/db_sisfoPinjamBarang";
    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement statement = null;
    private Connection connection = null;
    private ResultSet rs = null;
    
    public void connect() {
        try {
            connection = DriverManager.getConnection(server, dbuser, dbpasswd);
            statement = connection.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public Database() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "JDBC Driver Error", JOptionPane.WARNING_MESSAGE);
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/sisfogeladi", dbuser, dbpasswd);
            statement = connection.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ResultSet getData(String SQLString) {
        try {
            rs = statement.executeQuery(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error :" +e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    
    public void query(String SQLString){
        try {
            statement.executeUpdate(SQLString);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error :" +e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void saveAnggota(Anggota a){
        try{
            String query = "insert into anggota(noAnggota,namaAnggota,alamat) values('"+a.getNoAnggota()+"','"+a.getNama()+"','"+a.getAlamat()+"')";
            statement.execute(query);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan", "Kesalahan", 0);
        }
    }
    
    public void deleteAnggota(Anggota a){
        try{
            String query = "delete from anggota where namaAnggota='"+a.getNama()+"'";
            statement.execute(query);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan", "Kesalahan", 0);
        }
    }
    
    ArrayList<Anggota> loadAnggota(){
        try{
            ArrayList<Anggota> listAnggota = new ArrayList<>();
            String query = "select * from anggota";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                Anggota a;
                a = new Anggota(rs.getString(0),rs.getString(1),rs.getString(2));
                listAnggota.add(a);
            }
            return listAnggota;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan", "Kesalahan", 0);
        }
        return null; 
    }
    
}
