public class Parameter{
public static void main(String[]args){
    Parameter tes = new Parameter();
    tes.methodTampilkan2("Belajar Java Yuks");
    System.out.println(tes.tambahkanNilai(3, 5));
}


private void methodTampilkan2(String nama){
    System.out.println(nama);
}

private int tambahkanNilai (int x, int y){
    return x+y;
}
}