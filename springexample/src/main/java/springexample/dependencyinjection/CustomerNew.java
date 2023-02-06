package springexample.dependencyinjection;

public class CustomerNew implements IAddressInjector {

	private IAddress iaddress;

	public void injectAddress(IAddress iaddress) {
		this.iaddress=iaddress;

	}

}
