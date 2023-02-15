package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "vade oranı";
			
		Product product1 = new Product();
		product1.setName ( "Delonghi Kahve Makinesi");
		product1.setUnitPrice  (7500);
		product1.setDiscount  (7);
		product1.setUnitsInStock ( 3);
		product1.setImageUrl  ("bilmemne1.jpg");
		
		//get 
			
		//System.out.println(product1.name);
		
		Product product2 = new Product();
		product2.setName ( "a Kahve Makinesi");
		product2.setUnitPrice  (6500);
		product2.setDiscount  (8);
		product2.setUnitsInStock  (2);
		product2.setImageUrl  ("bilmemne2.jpg");
			
		Product product3 = new Product();
		product3.setName ("b Kahve Makinesi");
		product3.setUnitPrice(4500);
		product3.setDiscount(9);
		product3.setUnitsInStock ( 4);
		product3.setImageUrl ( "bilmemne3.jpg");
		
		Product[] products = {product1, product2, product3,};
		
		for(Product product : products) {
			System.out.println(product.getName());
			
			IndividualCustomer individualCustomer = new IndividualCustomer();
			individualCustomer.setId(1);
			individualCustomer.setPhone("05343895657");
			individualCustomer.setCustomerNumber("12345");
			individualCustomer.setFirstName("anıl");
			individualCustomer.setLastName("açık");
			
			CorporateCustomer corporateCustomer = new CorporateCustomer();
			corporateCustomer.setId(2);
			corporateCustomer.setPhone("0393893838");
			corporateCustomer.setCompanyName("kodlama");
			corporateCustomer.setTaxNumber("213213123");
			corporateCustomer.setCustomerNumber("12312312");
			
			Customer[] customers = {individualCustomer, corporateCustomer};
			System.out.println(individualCustomer.getFirstName() + corporateCustomer.getCompanyName() );
 			
		}
 	}

}
