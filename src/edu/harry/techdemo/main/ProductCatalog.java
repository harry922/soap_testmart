package edu.harry.techdemo.main;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import edu.harry.techdemo.service.ProductServiceImpl;

@WebService
public class ProductCatalog {

	ProductServiceImpl productService= new ProductServiceImpl();
	
	@WebMethod
	public List<String> getProductCatagories(){
		return productService.getProductCatagories();
	}	
	
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	
	public boolean addProduct(String category,String product) {
		return productService.addProduct(category,product);
	}
	
	
}


