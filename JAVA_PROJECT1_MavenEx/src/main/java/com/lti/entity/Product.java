package com.lti.entity;

public class Product {
private int prdid;
private String prdName;
private double prdCost;
private String companyName="LTI";

public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public Product() {
	super();
}
public Product(int prdid, String prdName, double prdCost) {
	super();
	this.prdid = prdid;
	this.prdName = prdName;
	this.prdCost = prdCost;
}
public int getPrdid() {
	return prdid;
}
public void setPrdid(int prdid) {
	this.prdid = prdid;
}
public String getPrdName() {
	return prdName;
}
public void setPrdName(String prdName) {
	this.prdName = prdName;
}
public double getPrdCost() {
	return prdCost;
}
public void setPrdCost(double prdCost) {
	this.prdCost = prdCost;
}
@Override
public String toString() {
	return "Product [prdid=" + prdid + ", prdName=" + prdName + ", prdCost=" + prdCost + "]";
}

}
