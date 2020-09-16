package y_Project;

import java.util.Vector;

public class DBClass {
	// Table Space -> Table 생성
	private Vector<ProductVO> proList = new Vector<>();	//물품 종류를 저장, 테이블 생성

	public boolean addProduct(String name, int price) {
		ProductVO pv1 = new ProductVO(name, price);
		boolean result = proList.add(pv1);
		return result;
	}
	
}
