/*
 *	Nama File   : Lingkaran.java
 *	Pembuat	    : Fahriant Ekrie
 *	NIM         : 24060121130071
 */


import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jari2;

    public Lingkaran(double r){
        jari2 = r;
    }

    public double hitungLuas(){
        return PI*jari2*jari2;
    }
}