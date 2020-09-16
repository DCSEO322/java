package y_Project;

public class Service {

	public boolean addProduct(String name, int price) {
		DBClass db = new DBClass();
		boolean result = db.addProduct(name, price);
		
		return result;
	}

}
