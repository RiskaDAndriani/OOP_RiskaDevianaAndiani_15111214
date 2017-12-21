public class MainHewan{
    public static void main(String[]args){
        Hewan ayamBoiler = new Ayam(); //jika konstruktor Ayam diganti dengan  konstruktor new Hewan maka ayamBoiler akan mengkompile method nama di class Hewan
        Hewan bebekAngsa = new Bebek();
        Object obj = new Hewan();

        ayamBoiler.nama();
        bebekAngsa.nama();
        
    }
}