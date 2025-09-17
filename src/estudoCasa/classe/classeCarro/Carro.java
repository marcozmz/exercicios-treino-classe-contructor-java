package estudoCasa.classe.classeCarro;

public class Carro {

    public String marca;
    public String modelo;
    public int ano;
    public double velocidade;
    
    Carro(String m, String model, int a, double vel){
        marca = m;
        modelo = model;
        ano = a;
        velocidade = vel;
    }
    
    public void acelerar(double valor){
        velocidade += valor;
    }
    
    public void freiar(double valor){
        velocidade -= valor;
        if( velocidade < 0){
            velocidade = 0;
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade);
    }
}
