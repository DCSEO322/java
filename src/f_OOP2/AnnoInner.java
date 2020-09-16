package f_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInner {
	public static void main(String[] args) {
		Button bt1 = new Button();
		
		
		ActionListener e1 = new EventHandler();
		// 상속과 유사한 개념으로 implements를 통해 ActionListener로 인터페이스타입을 변경할 수 있다.
		// 인터페이스타입의 참조변수로 이를 구현한 인스턴스를 참조할 수 있다.
		bt1.addActionListener(e1);
	}
}

class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("1번이 눌림");
	}
	
}