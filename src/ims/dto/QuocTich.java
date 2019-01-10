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
public class QuocTich {

    public QuocTich(String maQuocTich, String tenQuocTich) {
        this.maQuocTich = maQuocTich;
        this.tenQuocTich = tenQuocTich;
    }
    
    public QuocTich() {
        
    }

    public String getMaQuocTich() {
        return maQuocTich;
    }

    public void setMaQuocTich(String maQuocTich) {
        this.maQuocTich = maQuocTich;
    }

    public String getTenQuocTich() {
        return tenQuocTich;
    }

    public void setTenQuocTich(String tenQuocTich) {
        this.tenQuocTich = tenQuocTich;
    }
    private String maQuocTich;
    private String tenQuocTich;
}
