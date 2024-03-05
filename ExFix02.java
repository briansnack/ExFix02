import java.util.Scanner;

public class ExFix02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        for(int i = 1; i <= 5; i++){
        System.out.println("Número matrícula do aluno " + i + ": ");
        int matricula = leitor.nextInt();
        
        leitor.nextLine(); 

        System.out.println("Nome do aluno " + i + ": ");
        String nome = leitor.nextLine();

        System.out.println("Nota 1: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Nota 2:");
        double nota2 = leitor.nextDouble();

        double notaFinal = (nota1 + nota2) / 2;

        System.out.println("Matrícula do aluno " + i + ": " + matricula);
        System.out.println("Nome do aluno " + i + ": " + nome);
        if (notaFinal >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        System.out.println("Nota final: " + notaFinal);
        
        }
        leitor.close();
    }
}
