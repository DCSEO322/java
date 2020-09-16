package f_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInner2 {
	public static void main(String[] args) {
		Button b1 = new Button();
		
		b1.addActionListener(new ActionListener() {
			// 클래스의 생성과 동시에 객체를 생성 (1회성) - 익명클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1번 버튼 눌림");
			}
		});
		
		
		
		
	}
}
