import java.util.Scanner;

class Inputoutput {
	public static void main (String[] args) {
		String data;

		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Masukkan Data :");
		data = scan.nextLine();
		System.out.println ("Data yang Dimasukkan :"+ data);
		}
	}	