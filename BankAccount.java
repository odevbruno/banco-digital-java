public class BankAccount {
  private static int AccountCounter = 1000;
  private final int accountNumber;
  private double balance;
  private final Client client;

  public BankAccount(Client client){
    this.accountNumber = AccountCounter++;
    this.client = client;
    this.balance = 0.0f;
  }

  // deposit ✅
  // withdraw ✅
  // get balance ✅
  // get account number ✅ 
  // get client ✅ 

  public void deposit(double value){
    balance += value;
    System.out.println("Depósito de R$ "+ value +" realizado com sucesso !");
  }

  public boolean withdraw(double value){
    // Se o valor do saque for maior que o saldo
    if(value > balance){
      System.out.println("Saldo insuficiente !");
      return false;
    }

    balance -= value;
    System.out.println("Saque de R$ "+ value +" realizado com sucesso !");
    return  true;
  }

  public void getBalance(){
    System.out.println("Saldo da conta: " + accountNumber + "R$ " + balance);
  }

  public int getAccountNumber(){
    return accountNumber;
  }

  public Client getClient(){
    return client;
  }

  
}
