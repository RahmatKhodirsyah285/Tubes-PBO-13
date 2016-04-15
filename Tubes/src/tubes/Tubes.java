/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.util.Scanner;

public class Tubes {
    public static void main(String[] args) {
        int i;
        String a;
        Scanner in = new Scanner (System.in);
        Perjalanan p=new Perjalanan();
        Pelanggan p1=new Pelanggan();
        Petugas p2 = new Petugas();
        System.out.print("Masukan Jumlah Perjalanan :  ");
        i =in.nextInt();
        p.setJumlah(i);
        System.out.print("\nMenu Utama : \n 1. Petugas \n 2. Info \n 3. Pemesanan \n 0. Exit \n\nMasukan pilihan :");
        i = in.nextInt();
        switch (i){
            case 1:
                System.out.print("Menu Petugas");
                System.out.print("Nama :");
                a = in.next();
                p2.setNama(a);
                System.out.print("Nomor Identitas : ");
                a = in.next();
                p2.setId(a);
                System.out.print("Jabatan : ");
                a = in.next();
                p2.setJabatan(a);
                System.out.print("Nomor Telp : ");
                a = in.next();
                p2.setTelp(a);
                System.out.print("Masih akan melanjutkan Y or N : ");
                break;
                
                case 2:
                System.out.println("Info Tour and Travel");
                System.out.println("1. Tempat Wisata");
                System.out.println("2. Paket Wisata");
                System.out.println("3. Kendaraan");
                break;
                
                case 3:
                System.out.print("\nForm Pemesanan");
                System.out.print("\nNama :");
                a = in.next();
                p1.setNama(a);
                System.out.print("Nomor Identitas : ");
                a = in.next();
                p1.setId(a);
                System.out.print("Nomor Telp : ");
                a = in.next();
                p1.setTelp(a);
                System.out.print("\nMasih akan melanjutkan Y or N : ");
                break;
        }
        }
}