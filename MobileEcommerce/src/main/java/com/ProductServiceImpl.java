package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired  
	ProductDAO prdDao;  
	
	@Transactional
	public int insertRow(Product product) {
		prdDao.insertRow(product);
		return 0;
	}

	@Transactional
	public List<Product> getList() {
		return prdDao.getList();
	}

	@Transactional
	public Product getRowById(int id) {
		
		return prdDao.getRowById(id);
	}

	@Transactional
	public int updateRow(Product product) {
		 return prdDao.updateRow(product);  
	}

	@Transactional
	public int deleteRow(int id) {
		return prdDao.deleteRow(id);  
	}

}
