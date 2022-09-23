public class Main {
    public static void main(String[] args) {
       DortIslem dortIslem=new DortIslem();
       int sonuc =dortIslem.Topla(3,4);
       System.out.println(sonuc);
        int sonuc1 =dortIslem.Cıkar(5,4);
        System.out.println(sonuc1);
        int sonuc2=dortIslem.Carp(3,4);
        System.out.println(sonuc2);
        int sonuc3=dortIslem.Bol(6,3);
        System.out.println(sonuc3);
    }
}