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
public class TempatWisata {
    private String nama;
    private String alamat;
    private double harga;
    public TempatWisata(String nama,String alamat,double harga){
        this.nama=nama;
        this.alamat=alamat;
        this.harga=harga;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public double getHarga() {
        return harga;
    }
}
