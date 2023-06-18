import java.util.Scanner;

public class treino {

    public static void main(String[] args) {

        double n1, n2, n3;
        int freq;
        double media = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de faltas:");
        freq = sc.nextInt();

        if(freq >= 15){
            System.out.println("REPROVADO POR FALTA!");
        }
        else{
            System.out.println("Digite a primeira nota");
            n1 = sc.nextDouble();
            System.out.println("Digite a segunda nota:");
            n2 = sc.nextDouble();
            System.out.println("Digite a terceira nota:");
            n3 = sc.nextDouble();

            media = (n1 + n2 + n3)/3;
            if(media >= 7){
             System.out.println("APROVADO!!! Sua media é: "+media);
        }
            else if(media >= 4){
                System.out.println("Reprovado COM DIREITO A FINAL! Sua média é: "+media);
            }
            else{
                System.out.println("Reprovado.");
            }
}

}}