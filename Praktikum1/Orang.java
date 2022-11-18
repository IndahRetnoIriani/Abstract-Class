package Teori.Praktikum1;

public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;

    public Orang(String nama){
        this.nama = nama;
    }
    public void peliharaHewan(Hewan hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerak();
        System.out.println("Hewan peliharaanku termasuk jenis hewan: ");
        this.hewanPeliharaan.jenis();
        System.out.println("Suara hewan peliharaanku               : ");
        this.hewanPeliharaan.suara();
        System.out.println("--------------------------------------");
    }
    
}
