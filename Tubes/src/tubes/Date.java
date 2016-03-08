/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Rahmat Khodirsyah
 */
public class Date {
    private int tgl;
    private int bulan;
    private int tahun;

    public int getTgl() {
        return tgl;
    }

    public void setTgl(int tgl) {
        if(tgl >=1 && tgl <=30){
            this.tgl=tgl;
        }else{
            System.out.println("Tanggal yang anda masukan salah");
        }
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        if(bulan >=1 && bulan <=12){
            this.bulan=bulan;
        }else{
            System.out.println("Tanggal yang anda masukan salah");
        }
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
}
