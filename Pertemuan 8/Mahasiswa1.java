public class Mahasiswa1{
    String nama;

    Mahasiswa1(String nama){
        this.nama = nama;
        this.printNama();
    }
    public void printNama(){
        System.out.println(nama);
    }

    public static void main(String[] args){
        Mahasiswa1 mhs = new Mahasiswa1("Riska");
    }
}
