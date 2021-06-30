package forthDay;

public class KahveDunyasiCustomerManager extends BaseCustomerManager {
	//StarBucks boykot mal� o y�zden kahved�nyas�n� se�tim.

	CustomerCheckService _customerCheckService;
	
	public KahveDunyasiCustomerManager(CustomerCheckService _customerCheckService) {
		super();
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);

		} else {
			System.out.println("Not a valid person");
		}
		
	}

	
	
}
