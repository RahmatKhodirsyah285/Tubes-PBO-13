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
public class PaketWisata {
    private TempatWisata[] daftarTujuanWisata;
    private Kendaraan Kendaraan;
    private int jumlah;
    public PaketWisata(int i){
        daftarTujuanWisata=new TempatWisata[i];
    }
    public void addTempatWisata(TempatWisata w){
        daftarTujuanWisata[jumlah]=w;
        jumlah++;
    }
    public TempatWisata getDaftarTujuanWisata(int i) {
        return daftarTujuanWisata[i];
    }
    public Kendaraan getKendaraan() {
        return Kendaraan;
    }
    public void setKendaraan(Kendaraan Kendaraan) {
        this.Kendaraan = Kendaraan;
    } 
    public int getjumlah(){
        return jumlah;
    }
}
