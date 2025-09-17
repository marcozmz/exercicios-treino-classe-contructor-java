package estudoCasa.classe.classeCarro;

import estudoCasa.classe.classeCarro.Carro;

public class Main {
    public static void main(String[] args) {
        Carro mercedes = new Carro("Mercedes", "G63", 2025, 180);
        
        mercedes.acelerar(15);
        mercedes.freiar(5);
        mercedes.mostrarInfo();
        
        Carro c3 = new Carro("BMW", "320i", 2024, 250);
        
        c3.acelerar(20);
        c3.freiar(10);
        c3.mostrarInfo();
    }
}
