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
public class Doi {

    public Doi(String maDoi, String tenDoi) {
        this.maDoi = maDoi;
        this.tenDoi = tenDoi;
    }
    
    public Doi() {
        
    }

    public String getMaDoi() {
        return maDoi;
    }

    public void setMaDoi(String maDoi) {
        this.maDoi = maDoi;
    }

    public String getTenDoi() {
        return tenDoi;
    }

    public void setTenDoi(String tenDoi) {
        this.tenDoi = tenDoi;
    }
    private String maDoi;
    private String tenDoi;
}
