
package inharitancrpraktikum4;

import java.util.Scanner;


public class tampil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Wisata d = new Wisata();
        System.out.println("provinsi : ");
        d.provinsi = scan.nextLine();

        d.Pariwisata();
        d.Rekreasi();
        d.daerah();
        System.out.println("Jumlah Keseluruhan Wisata Hiburan di Jatim : " + d.daerah(90));
        System.out.println("Jumlah Keseluruhan Wisata Edukasi di Jatim : " + d.daerah(32));

    }
    
}
