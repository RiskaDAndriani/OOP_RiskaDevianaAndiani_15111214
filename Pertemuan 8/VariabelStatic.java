public class VariabelStatic {
    public static String nama;
    private String namaPrivate;

    public static void main (String[] args){
        VariabelStatic var= new VariabelStatic();
        var.namaPrivate = "Riska";
        VariabelStatic.nama ="Riska";
    }
}