/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengirimanbarangcrud;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Pengirim implements Serializable{
    
    private Integer id_pengirim;
    private String nama_pengirim;
    private String no_telepon;
    private String alamat;
    private String daerah;
    private String kota;
    private String provinsi;
    private Integer kode_pos;

    public Pengirim() {
    }

    public Integer getId_pengirim() {
        return id_pengirim;
    }

    public void setId_pengirim(Integer id_pengirim) {
        this.id_pengirim = id_pengirim;
    }

    public String getNama_pengirim() {
        return nama_pengirim;
    }

    public void setNama_pengirim(String nama_pengirim) {
        this.nama_pengirim = nama_pengirim;
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

    public String getDaerah() {
        return daerah;
    }

    public void setDaerah(String daerah) {
        this.daerah = daerah;
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
    
}
