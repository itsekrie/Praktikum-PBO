
/*  Nama file   : ArrayListTest.java
 *	Pembuat	    : Fahriant Ekrie
 *	NIM         : 24060121130071
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();

        //Menambahkan elemen kedalam list
        strings.add("Up");
        strings.add("And");
        strings.add("Down");

        // menghapus elemen dari list
        strings.remove("And");

        // mengubah elemen dalam ArrayList
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}