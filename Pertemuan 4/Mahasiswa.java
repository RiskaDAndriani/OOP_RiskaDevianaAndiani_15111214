public class Mahasiswa{
	public static void main (String[] args){
	System.out.println ("Ini adalah method utama");

	Mahasiswa Riska = new Mahasiswa();
	Riska.printNama();
	System.out.println (Riska.calculateUmur());
	}
public void printNama(){
	System.out.println ("Riska Deviana Andriani");
}
public int calculateUmur(){
	int tahun_lahir = 1995;
	int tahun_sekarang = 2017;

	int umur;
	umur = tahun_sekarang - tahun_lahir;

	return umur;
}
}