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
public class HonNhan {

    public HonNhan(String maHonNhan, String loaiHonNhan) {
        this.maHonNhan = maHonNhan;
        this.loaiHonNhan = loaiHonNhan;
    }
    
    public HonNhan() {
        
    }

    public String getMaHonNhan() {
        return maHonNhan;
    }

    public void setMaHonNhan(String maHonNhan) {
        this.maHonNhan = maHonNhan;
    }

    public String getLoaiHonNhan() {
        return loaiHonNhan;
    }

    public void setLoaiHonNhan(String loaiHonNhan) {
        this.loaiHonNhan = loaiHonNhan;
    }
    private String maHonNhan;
    private String loaiHonNhan;
}
