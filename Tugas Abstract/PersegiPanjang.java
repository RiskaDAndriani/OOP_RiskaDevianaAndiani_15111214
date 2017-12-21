public class PersegiPanjang extends BangunDatar{

    protected int hitungLuas(){
        System.out.println("Luas        = 20 x 7");
        return super.hitungLuas();
    }

    protected int hitungKeliling(){
        System.out.println("Keliling    = 2 * (20 + 7)");
        return super.hitungKeliling();
    }
 
    
    public void printLuas(){
        System.out.println("--------------------------------------------------------");
        System.out.println("                Hitung Persegi Panjang");
        System.out.println("--------------------------------------------------------");
        System.out.println("Luas        = " + hitungLuas());
        System.out.println("");
        
    }

    public void printKeliling(){
        System.out.println("Keeliling   = " + hitungKeliling());

        
    }
}