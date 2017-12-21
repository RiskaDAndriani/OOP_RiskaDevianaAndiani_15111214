public abstract class BangunDatar{
    int panjang = 20;
    int lebar = 7;

    protected int hitungLuas(){
        int luas;

        luas = panjang * lebar;

        return luas;    

    }

    protected int hitungKeliling(){
        int keliling;

        keliling = 2 * (panjang + lebar);

        return keliling; 

    }

    public abstract void printLuas();
    public abstract void printKeliling();

}