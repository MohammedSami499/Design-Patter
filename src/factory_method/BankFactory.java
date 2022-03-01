package factory_method;

public class BankFactory implements IBankFactory{

	@Override
	public IBank getBank(String id) {
		
		switch(id) {
		case "123456": return new BankA();
		case "111111": return new BankB();
		}
		
		return null;
	}

}
