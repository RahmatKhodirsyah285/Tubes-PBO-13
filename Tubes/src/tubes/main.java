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
public class main {
    public static void main(String[] args) {
        Perjalanan p=new Perjalanan(3,750000);
        Pelanggan p1=new Pelanggan();
        p1.setId(1301140014);
        p1.setNama("Rahmat Khodirsyah");
        p1.setTelp("087797102286");
        Pelanggan p2=new Pelanggan();
        p2.setId(1301140314);
        p2.setNama("Faisal Purnama");
        p2.setTelp("081224642616");
        Pelanggan p3=new Pelanggan();
        p3.setId(130114);
        p3.setNama("Dainira");
        p3.setTelp("08786363284");
        p.addPelanggan(p1);
        p.addPelanggan(p2);
        p.addPelanggan(p3);
        PaketWisata paket=new PaketWisata(2);
        TempatWisata t1=new TempatWisata("Tempat Wisata Pangandaran","Pangandaran",200000);
        TempatWisata t2=new TempatWisata("Green Canyon","Pangandaran",400000);
        Kendaraan mobil=new Mobil();
        mobil.setHarga(70000);
        paket.addTempatWisata(t1);
        paket.addTempatWisata(t2);
        paket.setKendaraan(mobil);
        p.setPaket(paket);
        System.out.println("Perjalanan Dengan Total : "+p.getTotal());
        System.out.println("Dengan Data Pelanggan Sebagai Berikut : ");
        for(int i=0;i<p.getJumlah();i++){
            System.out.println("ID   : "+p.getpelanggan(i).getId());
            System.out.println("Nama : "+p.getpelanggan(i).getNama());
            System.out.println("Telp : "+p.getpelanggan(i).getTelp());
        }
        System.out.println("Dengan Tempat Tujuan : ");
        for(int i=0;i<p.getpaket().getjumlah();i++){
            System.out.println("- Nama   : "+p.getpaket().getDaftarTujuanWisata(i).getNama());
            System.out.println("  Alamat : "+p.getpaket().getDaftarTujuanWisata(i).getAlamat());
        }
    }
}
