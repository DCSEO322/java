package f_OOP2;

public class ChildTest {
	public static void main(String[] args) {
		//1.
		Child c = new Child(); 
		c.volume = 10;
		c.volumeUp();
		System.out.println(c.volume);
		
		c.channel = 15;
		c.channelUp();					//c.channelUp을 해도 c안의 parent channel만 0에서 1로 올라가는 것
		System.out.println(c.channel);
		
		
		
		
		
		
	}
}

class Parent{
	int channel;
	void channelUp(){
		channel++;
	}
}

class Child extends Parent{
	int volume;
	int channel;
	void volumeUp(){
		volume++;
	}
}