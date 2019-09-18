package synchronizedThreads;

public class BankAccount {
    private  int balance = 0;
    private  final int overdraft;

    BankAccount(int overdraft){
        this.overdraft = overdraft;
    }

    void toUp(int amount){
        balance += amount;
    }

    void debit(int amount){
        balance -= amount;
    }

    int getBalance(){
        return balance;
    }

    int getOverdraft(){
        return overdraft;
    }



}
