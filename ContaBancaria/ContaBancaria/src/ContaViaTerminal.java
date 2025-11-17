import java.util.Scanner;

public class ContaViaTerminal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número da sua conta: ");
            int numeroDaConta = input.nextInt();

        System.out.println("Agora, digite a sua agência: ");
            String agenciaDaConta = input.nextLine();

        System.out.println("Digite nome: ");
            System.out.println("Nome = ");
            String nome = input.nextLine();
            
            System.out.println("Agora, digite seu sobrenome: ");
                System.out.println("Sobrenome = ");
                String sobrenome = input.nextLine();
               
        double saldoEmConta = 35000000.00;
                    
        System.out.printf("Olá %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque",nome,sobrenome,agenciaDaConta,numeroDaConta,saldoEmConta);

        // 
        input.close();
    }
}