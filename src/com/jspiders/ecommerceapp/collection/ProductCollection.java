package com.jspiders.ecommerceapp.collection;

import java.util.ArrayList;
import java.util.List;

import com.jspiders.ecommerceapp.entity.Product;

public class ProductCollection {
	private static List<Product> products = new ArrayList<Product>();
	
	public static List<Product>getProducts() {
		return products;
	}
}
