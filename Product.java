package oopIntro;

public class Product {
	
	//Constructor new lendiği zaman çalışır.
	public Product(int id,String name,Double unitPrice,String detail,int unitInStock) {
		
		this.id=id;
		this.name=name;
		this.detail=detail;
		this.unitPrice=unitPrice;
		this.unitInStock=unitInStock;
		
	}
	public Product()
	{
		System.out.println("Ben Çalıştım");
	}	
	int id;
	String name;
	Double unitPrice;
	String detail;
	int unitInStock;
	

}
