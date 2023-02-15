package inheritance;

public class CustomerMenager {
		
		public void add(Customer customer) {
			
			System.out.println(customer.id + customer.customerNumber + "kaydedildi");
		}
		
		public void addMultiple(Customer[] customers) {
			
				for (Customer customer : customers) {
					add(customer);
					
				}
			
		}
	
	
}
