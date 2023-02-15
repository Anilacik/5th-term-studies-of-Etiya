package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		//Db erişim kodları yazma yeri//
		System.out.println("JDBC ile veritabanına eklendi");
		
	}
}
