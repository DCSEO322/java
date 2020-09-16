package y_Project;

public class ProductVO {
	String name;
	int price;
	int bonusPoint;
	
	public ProductVO(String name, int price){
		this.name = name;
		this.price = price;
		bonusPoint = price/10;
	}
	
	
	
}
