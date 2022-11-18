package Teori.Praktikum1;

public class Kucing extends Hewan{
    @Override
    public void bergerak(){
        System.out.println("Bergerak dengan KAKI, \"Tap..tap..\"");
    }

    @Override
    public void jenis() {
        System.out.println("Hewan menyusui (Mamalia)");
        
    }

    @Override
    public void suara() {
        System.out.println("Bersuara dengan cara mengeong, \"Meong..meong..\"");
        
    }
}
