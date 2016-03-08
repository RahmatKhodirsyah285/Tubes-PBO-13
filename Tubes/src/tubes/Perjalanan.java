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
public class Perjalanan {
    private Pelanggan[] pelanggan;
    private double total;
    private PaketWisata paket;
    private Date Jadwal;
    
    public void addPelanggan(Pelanggan p){
        p = new Pelanggan();
    }

    public void setPaket(PaketWisata paket) {
        this.paket = paket;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getJadwal() {
        return Jadwal;
    }

    public void setJadwal(Date Jadwal) {
        this.Jadwal = Jadwal;
    }
    
}
