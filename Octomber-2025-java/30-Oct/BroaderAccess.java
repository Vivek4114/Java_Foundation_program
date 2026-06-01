abstract class Bank{
	
	protected abstract  void processLoan();
		 

}

 class PublicBank extends Bank{

	@Override
	public void processLoan(){
		System.out.println("Public Bank Method Process Loan");
	}
 
}

public class BroaderAccess
{
	public static void main(String []args){
		PublicBank p = new PublicBank();
		p.procesLoan();
	}
}

