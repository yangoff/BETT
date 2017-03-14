/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kai
 */
public class Calc {
    private float apost1;
    private float apost2;
    private boolean vap;
    private float mult1;
    private float mult2;
    private float luc1;
    private float luc2;
    private float luct;
    private String aps1;
    private String aps2;

    public Calc() {
    }

    public float getApost1() {
        return apost1;
    }

    public void setApost1(float apost1) {
        this.apost1 = apost1;
    }

    public float getApost2() {
        return apost2;
    }

    public void setApost2(float apost2) {
        this.apost2 = apost2;
    }

    public boolean isVap() {
        return vap;
    }

    public void setVap(boolean vap) {
        this.vap = vap;
    }

    public float getMult1() {
        return mult1;
    }

    public void setMult1(float mult1) {
        this.mult1 = mult1;
    }

    public float getMult2() {
        return mult2;
    }

    public void setMult2(float mult2) {
        this.mult2 = mult2;
    }

    public float getLuc1() {
        return luc1;
    }

    public void setLuc1(float luc1) {
        this.luc1 = luc1;
    }

    public float getLuc2() {
        return luc2;
    }

    public void setLuc2(float luc2) {
        this.luc2 = luc2;
    }

    public float getLuct() {
        return luct;
    }

    public void setLuct(float luct) {
        this.luct = luct;
    }

    public String getAps1() {
        return aps1;
    }

    public void setAps1(String aps1) {
        this.aps1 = aps1;
    }

    public String getAps2() {
        return aps2;
    }

    public void setAps2(String aps2) {
        this.aps2 = aps2;
    }
    
    public Boolean vale(float ap1,float ap2,float m1,float m2){
        
        /*
                
        jogador aposta 
        
        */
        
        //aposta 1 tt1- total -lc1 lucro
        boolean vlap= false;
        float tt1;
        float lc1;
        tt1 = m1*ap1;
        lc1 = tt1-ap1;
        
        //aposta 2 tt2 -total -lc2 lucro
        
        float tt2;
        float lc2;
        tt2=m2*ap2;
        lc2=tt2-ap2;
        
        
        if(lc1+lc2 < ap1+ap2){
            vlap = true;
        }
        
        return vlap;
    }
    
    public float apostaR(float ap1,float m1,float m2){
        float lc1;
        float ap2;
        lc1 = ap1*m1;
        ap2 = lc1/m2;
        return ap2;
        
    }
    
    public float multiplicadorR(float ap1,float ap2,float m1){
        float lc1;
        float m2;
        lc1 = ap1*m1;
        m2 = lc1/ap2;
        return m2;
        
    }
    
        
}
