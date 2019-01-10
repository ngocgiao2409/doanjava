/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dto;

/**
 *
 * @author mBuu
 */
public class NhomMau {

    public NhomMau(String maNhomMau, String loaiNhomMau) {
        this.maNhomMau = maNhomMau;
        this.loaiNhomMau = loaiNhomMau;
    }
    
    public NhomMau() {
        
    }

    public String getMaNhomMau() {
        return maNhomMau;
    }

    public void setMaNhomMau(String maNhomMau) {
        this.maNhomMau = maNhomMau;
    }

    public String getLoaiNhomMau() {
        return loaiNhomMau;
    }

    public void setLoaiNhomMau(String loaiNhomMau) {
        this.loaiNhomMau = loaiNhomMau;
    }
    private String maNhomMau;
    private String loaiNhomMau;
}
