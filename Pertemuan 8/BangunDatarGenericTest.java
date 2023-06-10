/*  Nama file   : BangunDatarGenericTest.java
 *	Pembuat	    : Fahriant Ekrie
 *	NIM         : 24060121130071
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // instansiasi object
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> Bangun = new BangunDatarGeneric<Lingkaran>();

        // memanggil method
        Bangun.set(l);

        // menampilkan output
        System.out.println("Keliling Lingkaran: " + Bangun.hitungKeliling());
        System.out.println("Tipe Generic: " + Bangun.get().getClass().getName());
    }
}