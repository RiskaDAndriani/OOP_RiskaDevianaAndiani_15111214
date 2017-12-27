public class Riska extends Mahasiswa{
    protected String getNama(){
        return super.getNama();
    }
    public void printNama(){
        System.out.println(getNama());
    }
    public static void main(String[]args){
        Mahasiswa riska = new Riska();

        riska.printNama();
    }
}