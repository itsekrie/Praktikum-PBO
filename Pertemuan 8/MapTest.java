/*  Nama file   : MapTest.java
 *	Pembuat	    : Fahriant Ekrie
 *	NIM         : 24060121130071
 */
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // membuat objek map
        Map<Integer, String> map = new HashMap<Integer, String>();

        // memasukkan elemen ke dalam map
        map.put(1, "6");
        map.put(2, "5");

        // mengambil elemen berdasarkan kunci
        System.out.println(map.get(1));

        // menghapus elemen berdasarkan kunci
        Set<Integer> key = map.keySet();
    }
}