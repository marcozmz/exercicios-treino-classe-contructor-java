package estudoCasa.classe.classeBanco;

public class Main {
    public static void main(String[] args) {
        
        ContaBancaria marco = new ContaBancaria("Marco", 111, 150);
        ContaBancaria maria = new ContaBancaria("Maria", 222, 500);
        
        marco.mostrarInfo();
        maria.mostrarInfo();
        
        marco.transferir(10, maria);
        
        marco.mostrarInfo();
        maria.mostrarInfo();
        
    }
}
