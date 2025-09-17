package estudoCasa.classe.classeAluno;

public class Aluno {
    
    //Você cria uma classe Aluno com atributos como:
    //String nome
    //int idade
    //double nota1, nota2, nota3
    //No construtor, você inicializa esses valores.
    //Métodos:
    //calcularMedia(): soma as notas, divide por 3 e retorna a média.
    //verificarAprovacao(): usa a média → se for maior ou igual a 6, retorna/apresenta que está aprovado; senão, reprovado.
    //mostrarInfo(): imprime o nome, idade e notas.
    
    public String nome;
    public int idade;
    public double nota1, nota2, nota3;
    public boolean aprovado;
    public double media;
    
    // Se quiser utilizar os mesmos nome pode, so tem que utilizar o this. antes 
    //Aluno(String nome, int idade, double nota1, double nota2, double nota3){
    //   this.nome = nome;
    //    this.idade = idade;
    //    this.nota1 = nota1;
    //    this.nota2 = nota2;
    //    this.nota3 = nota3;
    //}
    
    Aluno(String nom, int ida, double n1, double n2, double n3){
        nome = nom;
        idade = ida;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }
    
    public double calcularMedia(){
        return (nota1+nota2+nota3) / 3;
    }
    
    public boolean verificarAprovacao(){
        double media = calcularMedia();
        if(media >= 6){
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        media = calcularMedia();
        System.out.println("Notas: " + nota1 + " | " + nota2 + " | " + nota3 + "\nMedia: " + media);
        aprovado = verificarAprovacao();
        System.out.println("Aprovado: " + aprovado);
    }
}
