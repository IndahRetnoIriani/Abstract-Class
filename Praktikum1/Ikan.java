package Teori.Praktikum1;

public class Ikan extends Hewan{

    @Override
    public void bergerak(){
        System.out.println("Berenang dengan SIRIP, \"wush..wush\"");  

    }

    @Override
    public void jenis() {
        System.out.println("Hewan menyusui (Mamalia)");
        
    }

    @Override
    public void suara() {
        System.out.println("Bersuara seperti siulan atau peluit");
        
    }
    
}
