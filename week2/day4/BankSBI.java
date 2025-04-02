package week2.day4;

public class  BankSBI implements RBIINterface {
	
	public void mandateKYC()
	{
		System.out.println("SBI PAN Mandatory");
	}
	//public void depositMoney()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankSBI sbi = new BankSBI();		
		sbi.mandateKYC();

	}

}
