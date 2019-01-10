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
public class LoaiSucKhoe {

    public LoaiSucKhoe(String maSucKhoe, String loaiSucKhoe) {
        this.maSucKhoe = maSucKhoe;
        this.loaiSucKhoe = loaiSucKhoe;
    }
    
    public LoaiSucKhoe() {
       
    }

    public String getMaSucKhoe() {
        return maSucKhoe;
    }

    public void setMaSucKhoe(String maSucKhoe) {
        this.maSucKhoe = maSucKhoe;
    }

    public String getLoaiSucKhoe() {
        return loaiSucKhoe;
    }

    public void setLoaiSucKhoe(String loaiSucKhoe) {
        this.loaiSucKhoe = loaiSucKhoe;
    }
    private String maSucKhoe;
    private String loaiSucKhoe;
}
