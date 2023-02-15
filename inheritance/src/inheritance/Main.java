package inheritance;

public class Main {

	public static void main(String[] args) {
			
			IndividualCustomer engin = new IndividualCustomer();
				engin.id =1;
				engin.customerNumber = "1";
				engin.firstName = "engin";
				engin.lastName = "demiroğ";
				engin.nationalIdentity = "16264747879";
				
			
			CorporateCustomer hepsiBurada = new CorporateCustomer();
				hepsiBurada.customerNumber ="2"; 
				hepsiBurada.id = 2;
				hepsiBurada.companyName = "hepsi burada";
				hepsiBurada.taxNumber = "123";
				
			CustomerMenager customerMenager = new CustomerMenager();
			
			Customer[] customers = {engin, hepsiBurada};
			
				customerMenager.addMultiple(customers);
			
	}

}
