package Teori.Praktikum1;

public class Reptil extends Hewan {

    @Override
    public void bergerak() {
        System.out.println("Bergerak menggunakan kaki");
        
    }

    @Override
    public void jenis() {
        System.out.println("Hewan vertebrata berdarah dingin & memiliki sisik disekujur tubuh(Reptil)");
        
        
    }

    @Override
    public void suara() {
        System.out.println("Kebanyakan reptil tidak bersuara");
        
        
    }
    
}
