/*Nama File : Titik.java*/
/*Nama/Nim : Fahriant Ekrie/2406021130071 */
/*Tanggal : 22 Februari 2023*/

class Titik{
    private double absis;
    private double ordinat;
    static int counterTitik;

    Titik(double a, double o){
        counterTitik++;
        absis = a;
        ordinat = o;

    }
    Titik(){
        counterTitik++;
        absis = 0;
        ordinat = 0;

    }

    // Method

    //setter
    public void setAbsis(double a){
        absis = a;
    }
    public void setOrdinat(double o){
        ordinat = o;
    }

    //getter
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }

    public int getCounterTitik(){
        return counterTitik;
    }



}
