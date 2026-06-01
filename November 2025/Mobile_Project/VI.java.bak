
public class VI implements Sim {

	private double balance;
	@Override
	public void recharge(double amt) {
		this.balance = balance + amt;
		 System.out.println("Vi Sim ExesTing Balance is : "+ balance );
		
	}

	@Override
	public void currentBalance() {
		 
		 System.out.println("Vi Sim ExesTing Balance is : "+ balance );
	}

	@Override
	public String call(long mobNum) {
		return "Vi : " + mobNum  + " : the number your are dialing is currently busy please dial after some time";
		
	}

	@Override
	public String sms(long mobNum, String msg) {
		 
		return "Vi : "+ msg + " Send Successfully on " + mobNum+ " ";
	}
	


}
