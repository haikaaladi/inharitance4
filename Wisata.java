
package inharitancrpraktikum4;

import java.util.Scanner;


public class Wisata extends daerah{


    public String provinsi;
    public int wh, we;

    //overriding
    public void Pariwisata() {
        System.out.println("** " + super.pariwisata + " **");
    }

    public void Rekreasi() {
        System.out.println(" * provinsi  " + provinsi + " *");
    }

    //overloading
    public int daerah(int WisataHiburan) {
        this.wh = WisataHiburan;
        return wh;
    }

    public void daerah(double WisataEdukasi) {
        System.out.println("WisataTulungagung : " + WisataEdukasi);
    }

    public void daerah() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Malang      - 001 -");
        System.out.println(" Tulungagung - 002 -");
        System.out.println(" Surabaya    - 003 -");
        System.out.println(" Jombang     - 004 -");
        System.out.println(" Blitar      - 005 -");

        int WISATA = 1;

        System.out.println("pilih salah satu id kota : ");
        int id = input.nextInt();
        switch (id) {
            case 1:
                System.out.println("                  ");
                System.out.println("Kota           : Malang");
                System.out.println("Provinsi       : Jawa Timur");
                System.out.println("Jumlah Wisata  : (35)");
                System.out.println("Wisata Hiburan : (30)");
                System.out.println("Wisata Edukasi : (05)");
                System.out.println("--------------------");
                break;

            case 2:
                System.out.println("                  ");
                System.out.println("Kota           : Tulungagung");
                System.out.println("Provinsi       : Jawa Timur");
                System.out.println("Jumlah Wisata  : (22)");
                System.out.println("Wisata Hiburan : (15)");
                System.out.println("Wisata Edukasi : (07)");
                System.out.println("---------------------");
                break;

            case 3:
                System.out.println("                  ");
                System.out.println("Kota           : Surabaya");
                System.out.println("Provinsi       : Jawa Timur");
                System.out.println("Jumlah Wisata  : (26)");
                System.out.println("Wisata Hiburan : (19)");
                System.out.println("Wisata Edukasi : (07)");
                System.out.println("---------------------");
                break;

            case 4:
                System.out.println("                  ");
                System.out.println("Kota           : Jombang");
                System.out.println("Provinsi       : Jawa Timur");
                System.out.println("Jumlah Wisata  : (18)");
                System.out.println("Wisata Hiburan : (10)");
                System.out.println("Wisata Edukasi : (08)");
                System.out.println("---------------------");
                break;

            case 5:
                System.out.println("                  ");
                System.out.println("Kota           : Blitar");
                System.out.println("Provinsi       : Jawa Timur");
                System.out.println("Jumlah Wisata  : (21)");
                System.out.println("Wisata Hiburan : (16)");
                System.out.println("Wisata Edukasi : (05)");
                System.out.println("---------------------");
                break;
            default:
                System.out.println("id kota tidak dapat ditemukan");
        }
    }
}
