package factory_method;

public class BankA implements IBank {

	@Override
	public String withdraw() {
		return "BankA is used";
	}

	
}
