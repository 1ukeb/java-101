public class CheckingAccount{
  private double myBalance;
  private int myAccountNumber;

  public CheckingAccount(){
    myBalance = 0.0;
    myAccountNumber = 0;
  }

  public CheckingAccount(double initialBalance, int acctNum){
    myBalance = initialBalance;
    myAccountNumber = acctNum;
   }

  public double getBalance(){
    if(myBalance < 0){
        throw new IllegalArgumentException("Balance less than 0");
    }else
    return myBalance;
  }

  public void deposit(double amount){
    if(amount < 0){
        throw new IllegalArgumentException("Cannot deposit less than 0");
    }else
    myBalance += amount;
  }

  public void withdraw( double amount ){
    if(amount > myBalance){
        throw new IllegalArgumentException("Cannot withdraw more than your current balance");
    }else
    myBalance -= amount;
  }
}

