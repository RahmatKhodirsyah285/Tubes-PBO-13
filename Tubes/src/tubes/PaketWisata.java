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
    private TempatWisata daftarTujuanWisata;
    private Kendaraan Kendaraan;

    public void addTempatWisata(TempatWisata w){
        w = new TempatWisata();
        this.daftarTujuanWisata = w;
    }
    public TempatWisata getDaftarTujuanWisata() {
        return daftarTujuanWisata;
    }
    public Kendaraan getKendaraan() {
        return Kendaraan;
    }
    public void setKendaraan(Kendaraan Kendaraan) {
        this.Kendaraan = Kendaraan;
    } 
}
