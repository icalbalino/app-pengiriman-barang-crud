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
public class Paket implements Serializable{
    
    private Integer id_paket;
    private String tipe_paket;
    private Integer asuransi_paket;
    private Integer harga_paket;

    public Paket() {
    }

    public Integer getId_paket() {
        return id_paket;
    }

    public void setId_paket(Integer id_paket) {
        this.id_paket = id_paket;
    }

    public String getTipe_paket() {
        return tipe_paket;
    }

    public void setTipe_paket(String tipe_paket) {
        this.tipe_paket = tipe_paket;
    }

    public Integer getAsuransi_paket() {
        return asuransi_paket;
    }

    public void setAsuransi_paket(Integer asuransi_paket) {
        this.asuransi_paket = asuransi_paket;
    }

    public Integer getHarga_paket() {
        return harga_paket;
    }

    public void setHarga_paket(Integer harga_paket) {
        this.harga_paket = harga_paket;
    }
    
}
