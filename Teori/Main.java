package Teori;

public class Main {
    public static void main (String args[]){
        Lumut l     = new Lumut();
        Paku p      = new Paku();
        Berbiji b   = new Berbiji();
        System.out.println("==================KINGDOM PLANTAE==================");
        l.kelompok();
        l.jenis();
        l.contohNama();
        System.out.println("===================================================");
        p.kelompok();
        p.jenis();
        p.contohNama();
        System.out.println("===================================================");
        b.kelompok();
        b.jenis();
        b.contohNama();
        System.out.println("===================================================");
    }
}
