/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int pil;
        int b=-1;
        int a=-1;
        char status='n';
        Perjalanan[] p=new Perjalanan[99];
        Pelanggan[] pel=new Pelanggan[99];
        PaketWisata[] paket=new PaketWisata[99];
        TempatWisata[] tempat=new TempatWisata[99];
        do {
            System.out.println("1.Pesan tiket");
            System.out.println("2.Insert Paket Perjalanan");
            System.out.println("3.lihat data masuk");
            System.out.println("4.Lihat Paket Perjalanan");
            System.out.print("Masukkan Pilihan : ");
            pil=input.nextInt();
            switch(pil){
                case 1:
                    a=a+1;
                    System.out.print("masukkan jumlah orang : ");
                    int jum=input.nextInt();
                    p[a]=new Perjalanan(jum,750000);
                    input.nextLine();
                    for(int i=0;i<jum;i++){
                        pel[i]=new Pelanggan();
                        System.out.print("masukkan ID Pelanggan ke-"+(i+1)+" : ");
                        pel[i].setId(input.nextLine());
                        System.out.print("masukkan Nama Pelanggan ke-"+(i+1)+" : ");
                        pel[i].setNama(input.nextLine());
                        System.out.print("masukkan Telepon Pelanggan ke-"+(i+1)+" : ");
                        pel[i].setTelp(input.nextLine());
                        p[a].addPelanggan(pel[i]);
                    }
                    System.out.println("List Paket : ");
                    for (int i=0;i<(b+1);i++){
                        System.out.print((i+1)+". Paket "+(i+1)+" ("+ paket[i].getDaftarTujuanWisata(0).getNama());
                        for (int j=1;j<paket[i].getjumlah();j++){
                            System.out.print(", "+paket[i].getDaftarTujuanWisata(j).getNama());
                        }
                        System.out.println(")");
                        System.out.print("Harga : ");
                        double harga= paket[i].getDaftarTujuanWisata(0).getHarga();
                        for (int j=1;j<paket[i].getjumlah();j++){
                            harga=harga+paket[i].getDaftarTujuanWisata(j).getHarga();
                        }
                        System.out.println(harga);
                    }
                    System.out.print("Pilih paket :");
                    int temp= input.nextInt();
                    for (int i=0;i<(b+1);i++){
                        if (paket[i].getKodePaket()==temp){
                            p[a].setPaket(paket[i]);
                        }
                    }
                    break;
                case 2:
                    b=b+1;
                    System.out.print("Masukkan Jumlah Tempat Wisata : ");
                    int juml=input.nextInt();
                    paket[b]=new PaketWisata(juml);
                    paket[b].setKodePaket(b+1);
                    for(int i=0;i<juml;i++){
                        input.nextLine();
                        tempat[i]=new TempatWisata();
                        tempat[i].setID("TMP"+Integer.toString(i));
                        System.out.print("Masukkan Nama Tempat Wisata = ");
                        tempat[i].setNama(input.nextLine());
                        System.out.print("Masukkan Alamat = ");
                        tempat[i].setAlamat(input.nextLine());
                        System.out.print("Masukkan Harga = ");
                        tempat[i].setharga(input.nextDouble());
                        paket[b].addTempatWisata(tempat[i]);
                    }
                    break;
                case 3:
                    if (a<0){
                        System.out.println("Data Belum ada");
                    }
                    else{
                        for(int j=-1;j<a;j++){
                            System.out.println("=====================");
                            System.out.println("    Perjalanan "+(j+2));
                            System.out.println("=====================");
                            for(int i=0;i<p[j+1].getJumlah();i++){
                                System.out.println("____________________");
                                System.out.println("    Pelanggan ke-"+(i+1));
                                System.out.println("--------------------");
                                System.out.println("ID   : "+p[j+1].getpelanggan(i).getId());
                                System.out.println("Nama : "+p[j+1].getpelanggan(i).getNama());
                                System.out.println("Telp : "+p[j+1].getpelanggan(i).getTelp());
                            }
                            System.out.println("Paket "+p[j+1].getpaket().getKodePaket());
                            double harga=0;
                            for (int i=0;i<p[j+1].getpaket().getjumlah();i++){
                                System.out.println(" - "+p[j+1].getpaket().getDaftarTujuanWisata(i).getNama());
                                harga=harga+p[j+1].getpaket().getDaftarTujuanWisata(i).getHarga();
                            }
                            System.out.println("Harga = "+harga);
                        }    
                    }
                    break;
                case 4:
                    for (int i=0;i<(b+1);i++){
                        System.out.print((i+1)+". Paket "+i+" ("+ paket[i].getDaftarTujuanWisata(0).getNama());
                        for (int j=1;j<paket[i].getjumlah();j++){
                            System.out.print(", "+paket[i].getDaftarTujuanWisata(j).getNama());
                        }
                        System.out.println(")");
                        System.out.print("Harga : ");
                        double harga=paket[i].getDaftarTujuanWisata(0).getHarga();
                        for (int j=1;j<paket[i].getjumlah();j++){
                            harga=harga+paket[i].getDaftarTujuanWisata(j).getHarga();
                        }
                        System.out.println(harga);
                    }
                    break;
                default:
                    System.out.println("data tidak tersedia");
                    break;
            }
            System.out.println("Apakah anda ingin keluar?(y/n)");
            status=input.next().charAt(0);
        } while(status=='n');
    }
}
