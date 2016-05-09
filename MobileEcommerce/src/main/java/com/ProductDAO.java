package com;

import java.util.List;


public interface ProductDAO {

	 public int insertRow(Product product);  
	  
	 public List<Product> getList();  
	  
	 public Product getRowById(int id);  
	  
	 public int updateRow(Product product);  
	  
	 public int deleteRow(int id);  
}
