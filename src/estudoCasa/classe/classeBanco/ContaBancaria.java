package estudoCasa.classe.classeBanco;

public class ContaBancaria {

//Exercício 3 – Classe ContaBancaria

//Você cria a classe ContaBancaria com atributos:
//String titular
//int numero
//double saldo
//Construtor recebe esses dados.

//Métodos:
//depositar(double valor): aumenta o saldo.
//sacar(double valor): diminui o saldo, mas só se tiver dinheiro suficiente (if).
//transferir(ContaBancaria destino, double valor): tira de uma conta e coloca em outra.
//mostrarInfo(): imprime o titular, número e saldo.

    public String titular;
    public int numero;
    public double saldo;
    
    
    ContaBancaria(String titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }
    
    public void sacar(double valor){
        if(saldo > valor){
            saldo -= valor;
        }
        else{
            System.out.println("Valor acima do limite\n");
        }
    }
    
    public void transferir(double valor, ContaBancaria destino){
        if(saldo > valor){
            saldo -= valor;
            titular += valor;
            destino.saldo += valor;
        }
        else{
            System.out.println("Saldo insulficiente\n");
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Nome: " + titular);
        System.out.println("Numero: " + numero);
        System.out.println("saldo: " + saldo + "\n");
    }

}
