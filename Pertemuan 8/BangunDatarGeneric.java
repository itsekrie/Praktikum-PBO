/*  Nama file   : BangunDatarGeneric.java
 *	Pembuat	    : Fahriant Ekrie
 *	NIM         : 24060121130071
 */

public class BangunDatarGeneric<BD extends BangunDatar> {
    private BD bangunDatar;

    public void set(BD tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public BD get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}