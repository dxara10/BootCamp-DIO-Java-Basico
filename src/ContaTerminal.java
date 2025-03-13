import java.util.Scanner;



public class ContaTerminal {

    public static class Usuario extends ContaTerminal {
    
        String nome = "";
        String agencia = "";
        int numero = 0;
        double saldo= 0.0;

    
    
        public void sacar(double valor) {
            saldo = saldo - valor;
        }
        public void depositar(double valor) {
            saldo = saldo + valor;
        }
        
    }
    

    public static void main(String[] args) {
        Usuario cliente = new Usuario();
        Scanner clienteScanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        cliente.nome = clienteScanner.nextLine();

        System.out.println("Digite o número da sua agência: ");
        cliente.agencia = clienteScanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        cliente.numero = clienteScanner.nextInt();

        
        System.out.println("Olá " + cliente.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + cliente.agencia + ", conta " + cliente.numero + " e seu saldo " + cliente.saldo + " já está disponível para saque");
    }
}
