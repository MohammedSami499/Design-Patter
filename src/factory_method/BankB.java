package factory_method;

public class BankB implements IBank {

	@Override
	public String withdraw() {
		return "BankB is used";
	}

}
