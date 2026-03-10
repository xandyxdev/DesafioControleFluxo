import java.util.Scanner;
public class Contador {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int numeroUm = input.nextInt();
        System.out.println("Digite o segundo numero:");
        int numeroDois = input.nextInt();

        try {
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException e) {

        }

    }
    static void contar (int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        if (numeroUm > numeroDois){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = numeroDois - numeroUm;

            for (int i = 0 ; i <= contagem ; i++) {
                System.out.printf("Imprimindo o número %d\n", i);
            }
        }
    }
}

