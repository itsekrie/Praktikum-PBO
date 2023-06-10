/*Nama File : MOTitik.java*/
/*Nama/Nim : Fahriant Ekrie/2406021130071 */
/*Tanggal : 22 Februari 2023*/

class Main{
    public static void main(String[] args){
        Titik t1,t2;
        OperasiTitik t = new OperasiTitik();
        t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        System.out.println("t1 Absis : " + t1.getAbsis() + "\nt1 Ordinat : " + t1.getOrdinat());
        System.out.println("titik t1 setelah operasi refleksi sumbu x : (" + t1.getAbsis() + ',' + t.refleksiX(t1) + ")");
        System.out.println("titik t1 setelah operasi refleksi sumbu y : (" + t.refleksiY(t1) + ',' + t1.getOrdinat() + ")");
    }
}