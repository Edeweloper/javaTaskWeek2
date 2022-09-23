public class Main {
    public static void main(String[] args) {
//        OgregretmenKrediManager ogregretmenKrediManager= new OgregretmenKrediManager();
//        TarimKrediManager tarimKrediManager= new TarimKrediManager();
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgregretmenKrediManager());
    }
}