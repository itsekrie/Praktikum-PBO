/*
 *  Nama File   : MLingkaran.java
 *	Pembuat	    : Fahriant Ekrie
 *	NIM         : 24060121130071
 */

import java.util.Scanner;

public class MLingkaran{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("panjang jari-jari lingkaran : ");
        double jari2 = scan.nextDouble();
        Lingkaran l = new Lingkaran(jari2);
        System.out.println("Luas lingkaran dengan panjang jari-jari "+ jari2 + "adalah ="+ l.hitungLuas());
    }
}
  