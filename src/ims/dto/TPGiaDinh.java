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
public class TPGiaDinh {

    public TPGiaDinh(String maTPGiaDinh, String loaiTPGiaDinh) {
        this.maTPGiaDinh = maTPGiaDinh;
        this.loaiTPGiaDinh = loaiTPGiaDinh;
    }
    
    public TPGiaDinh() {
        
    }

    public String getMaTPGiaDinh() {
        return maTPGiaDinh;
    }

    public void setMaTPGiaDinh(String maTPGiaDinh) {
        this.maTPGiaDinh = maTPGiaDinh;
    }

    public String getLoaiTPGiaDinh() {
        return loaiTPGiaDinh;
    }

    public void setLoaiTPGiaDinh(String loaiTPGiaDinh) {
        this.loaiTPGiaDinh = loaiTPGiaDinh;
    }
    private String maTPGiaDinh;
    private String loaiTPGiaDinh;
}
