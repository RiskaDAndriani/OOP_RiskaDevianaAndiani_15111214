 public class Parameter{
public static void main(String[]args){
    Parameter tes = new Parameter();
    tes.iniAdalahProsedur("Belajar Java Yuks");
    System.out.println(tes.iniAdalahFunction(3, 5));
}


private void iniAdalahProsedur(String nama){
    System.out.println(nama);
}

private int iniAdalahFunction(int x, int y){
    return x+y;
}
}