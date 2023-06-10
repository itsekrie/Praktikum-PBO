/**
 * File : Segitiga.java 15/03/23
 * Penulis : Fahriant Ekrie/24060121130071
 * Deskripsi : representasi dari objek segitiga, turunan kelas poligon
 */
package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;

    // Konstruktor
    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = 3;

    }
    // Method
    public double hitungLuas(){
        return alas * tinggi * 1/2;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi " +this.getJumlahSisi());

    }
}
