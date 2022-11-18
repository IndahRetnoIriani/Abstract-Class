package Teori.Praktikum1;

public class Main {
    public static void main(String args[]){
        Kucing kucingkampung = new Kucing();
        Ikan lumbalumba = new Ikan();
        Reptil kurakura = new Reptil();

        Orang ani = new Orang("Ani");
        Orang indah = new Orang("Indah");
        Orang kansya = new Orang("Kansya");

        ani.peliharaHewan(lumbalumba);
        indah.peliharaHewan(kucingkampung);
        kansya.peliharaHewan(kurakura);

        ani.ajakPeliharaanJalanJalan();
        indah.ajakPeliharaanJalanJalan();    
        kansya.ajakPeliharaanJalanJalan();
    }   
}
