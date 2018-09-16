package edu.harry.techdemo.service;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	
	List<String> musicList=new ArrayList<>();
	List<String> booksList=new ArrayList<>();
	List<String> moviesList=new ArrayList<>();
	
	public ProductServiceImpl(){
		musicList.add("Music1");
		musicList.add("Music2");
		musicList.add("Music3");
		
		booksList.add("book1");
		booksList.add("book2");
		booksList.add("book3");
		
		moviesList.add("movie1");
		moviesList.add("movie2");
		moviesList.add("movie3");
	}
	
	public List<String> getProductCatagories(){
		List<String> categories= new ArrayList<>();
		categories.add("Music");
		categories.add("Books");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()) {
		case "music":
			return musicList;
		case "books":
			return booksList;
		case "movies":
			return moviesList;	
		}
		return null;
	}
	
	public boolean addProduct(String category,String product) {
		switch(category.toLowerCase()) {
		case "music":
			musicList.add(product);
			break;
		case "books":
			booksList.add(product);
			break;
		case "movies":
			moviesList.add(product);
			break;	
		default:
			return false;
		}
		return true;
	}
	
}
