package model;

import classes.Kendaraan;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModelKendaraan extends Koneksi{
    String query;
    
    public void searchKendaraan(){
        query = "SELECT * FROM `kendaraan` WHERE no_kendaraan LIKE '%1%'"; //where attribute and value need to be changed!
    }
    
    public Kendaraan[] fetchAll(){
        this.buka_koneksi();
        try {
            ArrayList<Kendaraan> myList = new ArrayList<Kendaraan>();
            query = "SELECT * FROM kendaraan";
            
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                String [] myRow = new String[6];
                myRow[0] = rs.getString("no_kendaraan");
                myRow[1] = rs.getString("nama_kendaraan");
                myRow[2] = rs.getString("no_polisi");
                myRow[3] = rs.getString("no_mesin");
                myRow[4] = rs.getString("warna");
                myRow[5] = rs.getString("tahun_kendaraan");
                myList.add(new Kendaraan(rs.getString("no_kendaraan"), rs.getString("no_polisi"), rs.getString("nama_kendaraan"), rs.getString("no_mesin"), rs.getString("warna"), rs.getString("tahun_kendaraan")));
            }   
            this.tutup_koneksi();
            return myList.toArray(new Kendaraan[myList.size()]);
        
        } catch (Exception e) {
            return null;
        }
    }
    
    public Kendaraan[] fetchByAttr(String atr, String val){
        this.buka_koneksi();
        try {
            ArrayList<Kendaraan> myList = new ArrayList<Kendaraan>();
            query = "SELECT * FROM kendaraan WHERE "+ atr +" LIKE '%"+val+"%'";
            
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                String [] myRow = new String[6];
                myRow[0] = rs.getString("no_kendaraan");
                myRow[1] = rs.getString("nama_kendaraan");
                myRow[2] = rs.getString("no_polisi");
                myRow[3] = rs.getString("no_mesin");
                myRow[4] = rs.getString("warna");
                myRow[5] = rs.getString("tahun_kendaraan");
                myList.add(new Kendaraan(rs.getString("no_kendaraan"), rs.getString("no_polisi"), rs.getString("nama_kendaraan"), rs.getString("no_mesin"), rs.getString("warna"), rs.getString("tahun_kendaraan")));
            }   
            this.tutup_koneksi();
            return myList.toArray(new Kendaraan[myList.size()]);
        
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean editDataKend(Kendaraan kend){
        this.buka_koneksi();
        try {
            query = "UPDATE kendaraan SET `no_kendaraan`='"+kend.getNoKendaraan()+"',`nama_kendaraan`='"+kend.getNamaKendaraan()+"',`no_mesin`='"+kend.getNoMesin()+"',`warna`='"+kend.getWarna()+"',`tahun_kendaraan`='"+kend.getThnKendaraan()+"' WHERE `no_polisi`='"+kend.getPlatNomor()+"' ";
            stmt.executeUpdate(query);
            stmt.close();
            this.tutup_koneksi();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public Kendaraan selectByPlatNo(String no){
        this.buka_koneksi();
        try {
            query = "SELECT * FROM kendaraan WHERE no_polisi ='"+ no +"'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Kendaraan kend = new Kendaraan();
            while(rs.next()){
                kend = new Kendaraan(rs.getString("no_kendaraan"), rs.getString("no_polisi"), rs.getString("nama_kendaraan"), rs.getString("no_mesin"), rs.getString("warna"), rs.getString("tahun_kendaraan"));
            }
            return kend;
        } catch (Exception e) {
            return null;
        }
        
    }
    
    public boolean insertDataKendaraan(Kendaraan kend){
        this.buka_koneksi();
        try {
            stmt = conn.createStatement();
            query = "INSERT INTO `kendaraan` (`no_kendaraan`, `nama_kendaraan`, `no_polisi`, `no_mesin`, `warna`, `tahun_kendaraan`) VALUES ('"+kend.getNoKendaraan()+"', '"+kend.getNamaKendaraan()+"', '"+kend.getPlatNomor()+"', '"+kend.getNoMesin()+"', '"+kend.getWarna()+"', '"+kend.getThnKendaraan()+"')";
            stmt.executeUpdate(query);
            stmt.close();
            this.tutup_koneksi();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public String[] selectPlatNomor(){
        this.buka_koneksi();
        try {
            ArrayList<String> datas = new ArrayList<String>();
            query = "SELECT no_polisi FROM kendaraan";
            
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            datas.add("Pilih No Polisi");
            while(rs.next()){
                datas.add(rs.getString("no_polisi"));
            }
            this.tutup_koneksi();
            return datas.toArray(new String[datas.size()]);
        } catch (Exception e) {
            return null;
        }
    }
    
    
}
