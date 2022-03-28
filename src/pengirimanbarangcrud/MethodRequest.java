/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengirimanbarangcrud;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author user
 */
public class MethodRequest implements Serializable{
    
    private Integer id_registrasi;
    private Paket paket;
    private Pengirim pengirim;
    private Petugas petugas;
    private Date tanggal;
    private String nama_penerima;
    private String no_telepon;
    private String alamat;
    private String kota;
    private String provinsi;
    private Integer kode_pos;
    private String isi_paket;
    private Integer berat_paket;
    private Integer total_harga;

    public MethodRequest() {
    }

    public MethodRequest(Integer id_registrasi, Paket paket, Pengirim pengirim, Petugas petugas, Date tanggal, String nama_penerima, String no_telepon, String alamat, String kota, String provinsi, Integer kode_pos, String isi_paket, Integer berat_paket, Integer total_harga) {
        this.id_registrasi = id_registrasi;
        this.paket = paket;
        this.pengirim = pengirim;
        this.petugas = petugas;
        this.tanggal = tanggal;
        this.nama_penerima = nama_penerima;
        this.no_telepon = no_telepon;
        this.alamat = alamat;
        this.kota = kota;
        this.provinsi = provinsi;
        this.kode_pos = kode_pos;
        this.isi_paket = isi_paket;
        this.berat_paket = berat_paket;
        this.total_harga = total_harga;
    }

    public Integer getId_registrasi() {
        return id_registrasi;
    }

    public void setId_registrasi(Integer id_registrasi) {
        this.id_registrasi = id_registrasi;
    }

    public Paket getPaket() {
        return paket;
    }

    public void setPaket(Paket paket) {
        this.paket = paket;
    }

    public Pengirim getPengirim() {
        return pengirim;
    }

    public void setPengirim(Pengirim pengirim) {
        this.pengirim = pengirim;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getNama_penerima() {
        return nama_penerima;
    }

    public void setNama_penerima(String nama_penerima) {
        this.nama_penerima = nama_penerima;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public Integer getKode_pos() {
        return kode_pos;
    }

    public void setKode_pos(Integer kode_pos) {
        this.kode_pos = kode_pos;
    }

    public String getIsi_paket() {
        return isi_paket;
    }

    public void setIsi_paket(String isi_paket) {
        this.isi_paket = isi_paket;
    }

    public Integer getBerat_paket() {
        return berat_paket;
    }

    public void setBerat_paket(Integer berat_paket) {
        this.berat_paket = berat_paket;
    }

    public Integer getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(Integer total_harga) {
        this.total_harga = total_harga;
    }
    
}
