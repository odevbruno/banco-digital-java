
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
     try {
      Scanner scanner =  new Scanner(System.in);
      Bank bank = new Bank();

      System.out.println("Bem-vindo ao Banco Digital!");
        
      System.out.print("Digite seu nome: ");
      String name = scanner.nextLine();

      System.out.print("Digite seu CPF: ");
      String cpf = scanner.nextLine();

      Client client = new Client(name, cpf);
      BankAccount account = bank.create(client);

      boolean selecting = true;
      while (selecting) {
          System.out.println("\nOpções:");
          System.out.println("1 - Depositar");
          System.out.println("2 - Sacar");
          System.out.println("3 - Ver Saldo");
          System.out.println("4 - Sair");
          System.out.print("Escolha: ");
          int option = scanner.nextInt();

          switch (option) {
              case 1 -> {
                      System.out.println("Valor do depósito: ");
                      double value = scanner.nextDouble();
                      account.deposit(value);
                  }
              case 2 -> {
                      System.out.println("Valor do saque: ");
                      double value = scanner.nextDouble();
                      account.withdraw(value);
                  }
              case 3 -> account.getBalance();
              case 4 -> {
                  selecting = false;
                  System.out.println("Obrigado por usar o Banco Digital!");
                }
              default -> System.out.println("Opção inválida.");
          }
    }
   
      scanner.close();
     } catch (Exception e) {
      System.out.println("Erro de execução: "+ e);
     }
  }
  
}
