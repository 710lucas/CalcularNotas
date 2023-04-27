import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno que voce deseja calcular a nota: ");

        String nome = sc.nextLine();
        Aluno aluno = new Aluno();
        aluno.setNome(nome);

        String digitado = null;

        do{

            System.out.printf("Digite uma nota para o usuario, digite sair para sair: ");;
            digitado = sc.nextLine();
            try {
                aluno.adicionaNota(Double.parseDouble(digitado));
            } catch(NumberFormatException e){
                ;
            }

        }while(!digitado.equals("sair"));

        aluno.setMelhorCalculo();
        System.out.println("A melhor media de " + aluno.getNome() + " foi: "+aluno.calculaNota());
        aluno.setCalculoDeNota(new Media());
        System.out.println("A media de " + aluno.getNome() + " foi: "+aluno.calculaNota());
        aluno.setCalculoDeNota(new MediaPonderada());
        System.out.println("A media de " + aluno.getNome() + " foi: "+aluno.calculaNota());
        aluno.setCalculoDeNota(new UltimaNota());
        System.out.println("A media de " + aluno.getNome() + " foi: "+aluno.calculaNota());

    }
}