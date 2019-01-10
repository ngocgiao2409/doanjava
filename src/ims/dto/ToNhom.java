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
public class ToNhom {

    public ToNhom(String maTo, String tenTo) {
        this.maTo = maTo;
        this.tenTo = tenTo;
    }
    
    public ToNhom() {
       
    }

    public String getMaTo() {
        return maTo;
    }

    public void setMaTo(String maTo) {
        this.maTo = maTo;
    }

    public String getTenTo() {
        return tenTo;
    }

    public void setTenTo(String tenTo) {
        this.tenTo = tenTo;
    }
    private String maTo;
    private String tenTo;
}
