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
    private int kodePaket;
    private TempatWisata[] daftarTujuanWisata;
    private Kendaraan Kendaraan;
    private int jumlah;
    public PaketWisata(int i){
        daftarTujuanWisata=new TempatWisata[i];
    }
    public int getKodePaket() {
        return kodePaket;
    }
    public void setKodePaket(int kodePaket) {
        this.kodePaket = kodePaket;
    }
    public void addTempatWisata(TempatWisata w){
        daftarTujuanWisata[jumlah]=w;
        jumlah++;
    }
    public TempatWisata getDaftarTujuanWisata(int i) {
        return daftarTujuanWisata[i];
    }
    public TempatWisata getDaftarTujuanWisatabyID(String a){
        for (int i = 0; i < jumlah; i++) {
            if (daftarTujuanWisata[i].getId().equalsIgnoreCase(a)){
                return daftarTujuanWisata[i];
            }         
        }
        return null;
    }
    public void removeTempatWisata(int i){
        daftarTujuanWisata[i]=null;
        for(int a=i;a<jumlah-1;a++){
            daftarTujuanWisata[a]=daftarTujuanWisata[a+1];
            a++;
        }
        jumlah=jumlah-1;
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
