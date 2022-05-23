import java.util.Scanner;
public class MediaFundamental {
    public static void main(String[] args){
        //Uso do Scanner para inputar os dados
        Scanner scan = new Scanner(System.in);
        //Declaracao de variaveis
        int RA;
        double nota1, nota2, nota3, media;

        //Utilizacao do WHILE para repeticao do programa
        while (true) {
            //Entrada de dados da variável RA
            System.out.print("\nDigite seu RA: ");
            RA = scan.nextInt();
            //Condicional para identificar se o programa deve parar
            if (RA == 0)
            break;
            //Entrada de dados nota1, nota2 e nota3
            System.out.printf("\nAluno " + RA + ", digite a primeira nota: ");
            nota1 = scan.nextDouble();
            System.out.printf("Aluno " + RA + ", digite a segunda nota: ");
            nota2 = scan.nextDouble();
            System.out.printf("Aluno " + RA + ", digite a terceira nota: ");
            nota3 = scan.nextDouble();

            //Cálculo das notas
            media = ((nota1 + nota2 + nota3) / 3);
            
            //Condicional para identificar se o aluno está aprovado, e informar se esta de recuperacao ou reprovado
            if (media >= 8)
           { System.out.printf("Aluno " + RA + ", sua media e igual a " + media + " e voce foi aprovado!\n"); }
           else if (media < 8 && media > 6)
           { System.out.printf("Aluno " + RA + ", sua media e igual a " + media + " e voce tera que fazer recuperacao!\n"); }
           else
           { System.out.printf("Aluno " + RA + ", sua media e igual a " + media + " e foi reprovado!\n"); }
        }
        //Informar que a programação foi encerrada
        System.out.print("RA invalido. Finalizando programacao!");
    }
}