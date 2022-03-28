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
public class Petugas implements Serializable{
    
    private Integer id_petugas;
    private String nama_petugas;
    private String no_telepon;
    private String alamat;
    private String daerah_tugas;
    private String jabatan;

    public Petugas() {
    }

    public Integer getId_petugas() {
        return id_petugas;
    }

    public void setId_petugas(Integer id_petugas) {
        this.id_petugas = id_petugas;
    }

    public String getNama_petugas() {
        return nama_petugas;
    }

    public void setNama_petugas(String nama_petugas) {
        this.nama_petugas = nama_petugas;
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

    public String getDaerah_tugas() {
        return daerah_tugas;
    }

    public void setDaerah_tugas(String daerah_tugas) {
        this.daerah_tugas = daerah_tugas;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
}
