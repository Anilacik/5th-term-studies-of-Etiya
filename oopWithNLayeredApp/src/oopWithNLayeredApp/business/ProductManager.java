package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		
		this.productDao = productDao;
	}

	public void add(Product product) throws Exception {
		//iş kuralları//
		
		if(product.getUnitPrice()<10) {
			
			throw new Exception("ürün fiyatı 10 dan küçük olamaz");
			}
			
			
			productDao.add(product);
		
	}

}
