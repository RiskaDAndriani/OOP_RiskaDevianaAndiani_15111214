public class Mahasiswa{
    String nama;

    Mahasiswa(){
        this.nama = "Riska";
        this.printNama();
    }
    public void printNama(){
        System.out.println(nama);
    }

    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
    }
}
