import java.util.ArrayList;
import java.util.List;

public class Bank {
// list accounts ✅
// create new account ✅
// consult account ✅

private final List<BankAccount> accounts = new ArrayList<>();

public BankAccount create(Client client){
  BankAccount newAccount = new BankAccount(client);
  accounts.add(newAccount);
  System.out.println("Conta criada com sucesso! Número: " + newAccount.getAccountNumber());
  return  newAccount;
}

public BankAccount consult(int accountNumber){
  for (BankAccount account : accounts) {
      if(account.getAccountNumber() == accountNumber){
        return account;
      }
  }
  return null;
}

  
}
