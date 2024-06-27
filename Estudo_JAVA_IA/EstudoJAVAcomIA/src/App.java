import java.util.Scanner;
public class App {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double saldo = 0;
            boolean continuar = true;
    
            while (continuar) {
      
                int opcao = scanner.nextInt();
    
                switch (opcao) {
                    case 1: System.out.println("Digite o valor para depositar: ");
                    double deposito = scanner.nextDouble();
                    if(deposito > 0){
                      saldo +=  deposito;
                           System.out.println("Deposito realizado com sucesso! Saldo atual: R$ " + saldo);
                        } else {   
                          System.out.println("Saldo atual: 0");
                    }
                       
                        break;
                    case 2:System.out.println("Digite o valor para sacar: ");
                    double saque = scanner.nextDouble();
                    if (saque > 0 || saque <= saldo) {
                            saldo -= saque;
                            System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + saldo);
                        } else {
                            System.out.println("Valor de saque inválido ou saldo insuficiente!");
                        }
                   
                        break;
                    case 3:
                       System.out.println("Seu saldo atual é: R$ " + saldo);
                   
                        break;
                    case 0:
                        System.out.println("Programa encerrado.");
                        continuar = false;  
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
            scanner.close();
        }
    }

