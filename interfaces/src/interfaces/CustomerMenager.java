package interfaces;

public class CustomerMenager {
	
	private Logger[] loggers;

	public CustomerMenager(Logger[] loggers) {
	
		this.loggers = loggers;
	}

	public void add(Customer customer) {

		System.out.println("müşteri eklendi" + customer.getFirstName());
		
		Utils.RunLoggers(loggers, customer.getFirstName());


	}

	public void delete(Customer customer) {

		System.out.println("müşteri silindi" + customer.getFirstName());
		
		
		Utils.RunLoggers(loggers, customer.getLastName());
		

	}

}
