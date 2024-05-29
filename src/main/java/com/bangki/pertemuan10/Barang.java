/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bangki.pertemuan10;

/**
 *
 * @author Rifki Saputra
 */
public class Barang {
    
    public String kd,nm;
    public int jml;
    public double hrg,ttl,ub,uk;

    public String getKd() {
        return kd;
    }

    public void setKd(String kd) {
        this.kd = kd;
    }
    
    public void setSeleksiKd(){
        if(kd.equalsIgnoreCase("B001")){
            nm="Pensil";
            hrg=3000;
        }else if(kd.equalsIgnoreCase("B002")){
            nm="Buku";
            hrg=5000;
        }else if(kd.equalsIgnoreCase("B003")){
            nm="Penggaris";
            hrg=1000;
        }else if(kd.equalsIgnoreCase("B004")){
            nm="Penghapus";
            hrg=500;
        }else{
            nm="";
            hrg=0;
        }
    }
    
    

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public int getJml() {
        return jml;
    }

    public void setJml(int jml) {
        this.jml = jml;
    }

    public double getHrg() {
        return hrg;
    }

    public void setHrg(double hrg) {
        this.hrg = hrg;
    }

    public double getTtl() {
        ttl = hrg*jml;
        return ttl;
    }

    public void setTtl(double ttl) {
        this.ttl = ttl;
    }

    public double getUb() {
        return ub;
    }

    public void setUb(double ub) {
        this.ub = ub;
    }

    public double getUk() {
        return (ub-ttl);
    }

    public void setUk(double uk) {
        this.uk = uk;
    }
   
    
    
    
}
