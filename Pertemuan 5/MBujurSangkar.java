/*
 * MBujurSangkar.java
 *	Pembuat	    : Fahriant Ekrie
 *	NIM         : 24060121130071
 */

import java.util.Scanner;

class MBujurSangkar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar b = new BujurSangkar();
        System.out.print("Masukkan panjang sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan panjang sisi "+sisi+
                " satuan adalah "+bs.hitungLuas(sisi));
    }
}
 
 
 