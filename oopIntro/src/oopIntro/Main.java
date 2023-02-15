package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product ();
			product1.setId(1);
			product1.setName("lenovo14");
			product1.setUnitPrice(10000);
			product1.setDetail("16 gm ram");
			product1.setDiscount(10);
		

		Product product2 = new Product ();
			product2.setId(2);
			product2.setName("lenovo15");
			product2.setUnitPrice(20000);
			product2.setDetail("32 gm ram");
			product2.setDiscount(10);
		
			
		
		Product product3 = new Product ();
			product3.setId(3);
			product3.setName("lenovo16");
			product3.setUnitPrice(50000);
			product3.setDetail("64 gm ram");
			product3.setDiscount(10);
			
		
			
		
				System.out.println(product3.getUnitPriceAfterDiscount());
			
				Category category1 = new Category(); 
					category1.setId(1);
					category1.setName("içecek");
			
					Category category2 = new Category(); 
					category2.setId(2);
					category2.setName("yiyecek");
					
					
					
					System.out.println(category1.getId());
					System.out.println(category2.getName());
			
			
		
		
	//	Product[] products = { product1, product2, product3 };

	//	for (Product product : products) {

			// System.out.println(product.name);

		}

		// System.out.println(product3.name);

	//	Category category1 = new Category();

//		category1.id = 1;
	//	category1.name = "pc";

		//Category category2 = new Category();

//		category2.id = 2;
//		category2.name = "pc2";

	//	Category category3 = new Category();

		// category3.id = 3;
	//	category3.name = "pc3";

	//	if (category1.id == 2) {
			// System.out.println(category1.name);
		// }

	//	else if (category2.id == 3) {
			// System.out.println(category2.name);
	//	}

//		else {
			// System.out.println(category1.id + category2.id);

//		}

	//	Category[] categorys = { category1, category2, category3 };

//		for (Category category : categorys) {
			// System.out.println(category1.id + category2.name);

	//	}

	//	ProductMenager productMenager = new ProductMenager();

	//	productMenager.addToCart(category2, product1);

	//}

}
