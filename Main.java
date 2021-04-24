package oopIntro;

public class Main { // sınıflar 2 ye ayrılır iş yapanlar method tutucu ve 

	public static void main(String[] args) {

		Product product1=new Product(1,"Lenovo",15.500,"Bu bir bilgisayar",3); //Referans Oluşturma
	
		Product product2=new Product();
		product2.id=2;
		product2.name="Samsung";
		product2.detail="Bu Bir Ekrandur";
		product2.unitPrice=15.600;
		product2.unitInStock=3;
		Product product3=new Product();
		product3.id=3;
		product3.name="Philips";
		product3.detail="Bu Bir Powerbanktir";
		product3.unitPrice=(double) 1000;
		product3.unitInStock=3;
		
		
		Product[] products = {product1,product2,product3
				
		};
		for (Product product : products) {
			
				System.out.println(product.name);
			}
			
		
		System.out.println(products.length);
		System.out.println("Ürünün Adı " + product1.name + "Ürün Detayı " + product1.detail);
		System.out.println(product2.name);
		System.out.println(product3.name);
		
		Category category1 = new Category();
		Category category2 = new Category();
		Category category3 = new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		category2.id=2;
		category2.name="Ev Aletleri";
		category3.id=3;
		category3.name="Temizlik Ürünleri";
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
	}
	
}
