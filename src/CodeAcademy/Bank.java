package CodeAcademy;

public class Bank{
	  private CheckingAccount accountOne;
	  private CheckingAccount accountTwo;

	  public Bank(){
	    accountOne = new CheckingAccount("Zeus", 100);
	    accountTwo = new CheckingAccount("Hades", 200);
	  }

	  public static void main(String[] args){
	    Bank bankOfGods = new Bank();
	    bankOfGods.accountOne.addFunds(5);
	    bankOfGods.accountOne.getInfo();
	    
	    bankOfGods.accountTwo.addFunds(2000);
	    bankOfGods.accountTwo.getInfo();
	    
	    

	  }

	}