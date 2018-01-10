import java.util.Scanner;
public class Mahasiswa implements Registrasi{
    String nama;
    public void biodata(){
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();
    }

    public void printBiodata(){
        System.out.println("Nama Anda : " + nama);

    }
}