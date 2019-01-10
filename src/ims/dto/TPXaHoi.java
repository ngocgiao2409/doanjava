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
public class TPXaHoi {

    public TPXaHoi(String maTPXaHoi, String loaiTPXaHoi) {
        this.maTPXaHoi = maTPXaHoi;
        this.loaiTPXaHoi = loaiTPXaHoi;
    }
    
    public TPXaHoi() {
        
    }

    public String getMaTPXaHoi() {
        return maTPXaHoi;
    }

    public void setMaTPXaHoi(String maTPXaHoi) {
        this.maTPXaHoi = maTPXaHoi;
    }

    public String getLoaiTPXaHoi() {
        return loaiTPXaHoi;
    }

    public void setLoaiTPXaHoi(String loaiTPXaHoi) {
        this.loaiTPXaHoi = loaiTPXaHoi;
    }
    private String maTPXaHoi;
    private String loaiTPXaHoi;
}
