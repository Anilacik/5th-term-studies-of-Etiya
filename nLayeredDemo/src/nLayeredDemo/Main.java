package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductMenager;
import nLayeredDemo.core.JLoggerMenagerAdapter;
import nLayeredDemo.dataAccess.concretes.abcProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerMenager;

public class Main {

	public static void main(String[] args) {
		
		// ToDo: Spring IoC ile çözülecek
		ProductService productService = new ProductMenager(new abcProductDao(),new JLoggerMenagerAdapter());
		
		Product product = new Product(2,2,"elma",12,50);
		productService.add(product);
	}

}
