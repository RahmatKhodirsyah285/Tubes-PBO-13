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
public class Kereta extends Kendaraan {
    private String kelas;

    @Override
    public String getSeat() {
        return super.getSeat();
    }
    @Override
    public void setSeat(String seat) {
        super.setSeat(seat);
    }
    @Override
    public double getHarga() {
        return super.getHarga();
    }
    @Override
    public void setHarga(double harga) {
        super.setHarga(harga);
    }
    public String getKelas() {
        return kelas;
    }
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }   
}
