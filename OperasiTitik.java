public class OperasiTitik {
    //operasi titik
    private void refleksiSumbuX(Titik t){
        t.setOrdinat(t.getOrdinat() * -1);
    }
    private void refleksiSumbuY(Titik t){
        t.setAbsis(t.getAbsis() * -1);
    }
    public double refleksiY(Titik t){
        refleksiSumbuY(t);
        return t.getAbsis();
    }
    public double refleksiX(Titik t){
        refleksiSumbuX(t);
        return t.getOrdinat();
    }

}
