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
    private int jumlahpelanggan;
    private PaketWisata paket;
    private Date Jadwal;
    
    public Perjalanan(int i,double tot){
        pelanggan=new Pelanggan[i];
        total=tot;
    }
    
    public void addPelanggan(Pelanggan p){
        pelanggan[jumlahpelanggan]=p;
        jumlahpelanggan++;
    }
    public Pelanggan getpelanggan(int i){
        return pelanggan[i];
    }
    public Pelanggan getpelanggan(String a){
        for (int i = 0; i < jumlahpelanggan; i++) {
            if (pelanggan[i].getId().equalsIgnoreCase(a)){
                return pelanggan[i];
            }         
        }
        return null;
    }
    public void setPaket(PaketWisata paket) {
        this.paket = paket;
    }
    public PaketWisata getpaket(){
        return paket;
    }
    public double getTotal() {
        total=0;
        for(int i=0;i<paket.getjumlah();i++){
            total=total+paket.getDaftarTujuanWisata(i).getHarga();
        }
        total=total+paket.getKendaraan().getHarga();
        return total*jumlahpelanggan;
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
    public int getJumlah(){
        return jumlahpelanggan;
    }
    
}
