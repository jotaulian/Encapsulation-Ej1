package CodeAcademy;

public class CheckingAccount{
	  private String name;
	  private int balance;

	  public CheckingAccount(String inputName, int inputBalance){
	    name = inputName;
	    balance = inputBalance;
	  }

	  public void addFunds(int fundsToAdd){
	    balance += fundsToAdd;
	  }

	  public void getInfo(){
	    System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
	  }

	  public static void main(String[] args){
	    CheckingAccount myAccount = new CheckingAccount("Julian", 35000);
	    myAccount.getInfo();
	    System.out.println("Let's add some more money...");
	    myAccount.addFunds(10000);
	    System.out.println("Now there are " + myAccount.balance + " Euros in " + myAccount.name + "'s Account.");
	  }

	}