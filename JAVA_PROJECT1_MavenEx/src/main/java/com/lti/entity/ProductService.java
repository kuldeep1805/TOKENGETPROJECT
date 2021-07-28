package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

	List<Product>prdList=new ArrayList<>();

	public String addProduct ( Product product)
	{
		prdList.add(product);
		return "Product Added";
	}

}


