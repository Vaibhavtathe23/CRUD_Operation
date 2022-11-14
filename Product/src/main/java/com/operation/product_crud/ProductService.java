package com.operation.product_crud;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService 
{
	@Autowired
	private ProductRepository repo;
	public List<Product> listAll()
	{
		return repo.findAll();
	}
	     
	    public void save(Product product) {
	        repo.save(product);
	    }
	     
	    public Product get(long productid) {
	        return repo.findById(productid).get();
	    }
	     
	    public void delete(long productid) {
	        repo.deleteById(productid);
	    }

}
