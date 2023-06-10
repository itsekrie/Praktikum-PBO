/*  Nama file   : Lingkaran.java
 *	Pembuat	    : Fahriant Ekrie
 *	NIM         : 24060121130071
 */

public class Lingkaran extends BangunDatar {
    private double jari2;

    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    public double hitungKeliling() {
        return 2 * jari2 * 3.14;
    }
}