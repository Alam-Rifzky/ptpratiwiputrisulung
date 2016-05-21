package model;

import classes.Pengguna;
import classes.Transaksi;

public class ModelTransaksi extends Koneksi{
    String query;
    
    public boolean peminjamanKendaraan(Pengguna trans){
        this.buka_koneksi();
        try {
            stmt = conn.createStatement();
            query = "INSERT INTO `permintaan_kendaraan` (`no_trans`, `tanggal`, `no_kendaraan`, `tujuan`, `km_go`, `nama_kend`, `warna_kend`, `thn_kend`, `sopir`, `data_kerusakan`, `km_back`) "
                    + "VALUES ('"+trans.getNoTrans()+"', '2016-05-02', '"+trans.getNoKend()+"', '"+trans.getTujuan()+"', '"+trans.getKmGo()+"', '"+trans.getNamaKend()+"', '"+trans.getWarnaKend()+"', '"+trans.getThnKend()+"', '"+trans.getSopir()+"', '"+trans.getDataKerusakan()+"', '"+trans.getKmBack()+"')";
            //query = "INSERT INTO `permintaan_kendaraan` (`no_trans`, `tanggal`, `no_kendaraan`, `tujuan`, `km_go`, `nama_kend`, `warna_kend`, `thn_kend`, `sopir`, `data_kerusakan`, `km_back`) VALUES ('2', '2016-05-01', '12', 'bogor', '31', 'asdas', 'asdasda', 'dsasda', 'asdasda', 'asdasd', '212')";
            stmt.executeUpdate(query);
            stmt.close();
            this.tutup_koneksi();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            tutup_koneksi();
            return false;
        }
    }
    
    public void pengembalianKendaraan(){
        
    }
}
