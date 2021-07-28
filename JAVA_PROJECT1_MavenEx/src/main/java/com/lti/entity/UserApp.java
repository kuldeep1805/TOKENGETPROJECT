package com.lti.entity;

public class UserApp {
public static void main(String[] args) {
	Calculator c=new Calculator();
	int r=c.sum(100,200);
	System.out.println("addition is:"+r);
   Product p=new Product(101,"Mobile",3000);
   //System.out.println(p);
   ProductService ps=new ProductService();
   String str=ps.addProduct(p);
   System.out.println(str);
}
}
