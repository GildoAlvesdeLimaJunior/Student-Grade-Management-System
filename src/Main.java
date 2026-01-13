import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdAlunos;
        float soma = 0;
        System.out.println("Digite a quantidade de alunos desejados: ");
        qtdAlunos = scan.nextInt();

        Aluno[] dados = new Aluno[qtdAlunos];

        for(int i = 0; i < qtdAlunos; i++){
            scan.nextLine();
            dados[i] = new Aluno();

            System.out.println("Qual o nome do aluno " + (i+1));
            dados[i].nome = scan.nextLine();

            System.out.println("Qual a primeira nota do aluno " + (i+1));
            dados[i].av1 = scan.nextFloat();

            System.out.println("Qual a segunda nota do aluno " + (i+1));
            dados[i].av2 = scan.nextFloat();

            soma += Aluno.media(dados[i].av1,dados[i].av2);
        }

        System.out.println("Relatório: ");
        for(int i = 0; i < qtdAlunos; i++){
            System.out.println((i+1) + "." + "Aluno: " + dados[i].nome + "| " + "Média: " + Aluno.media(dados[i].av1,dados[i].av2) + "| " + "Resultado: " + Aluno.resultado(dados[i]));
        }

        System.out.println("Média da sala: " + (soma/qtdAlunos));

        int maior = 0;

        for(int i = 1; i < qtdAlunos;i++){
            if(Aluno.media(dados[i].av1,dados[i].av2) > Aluno.media(dados[maior].av1,dados[maior].av2)){
                maior = i;
            }
        }

        System.out.println("Melhor Aluno: " + dados[maior].nome);
    }
}