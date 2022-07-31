
class Window{
	Window(int marker){
		System.out.println("Window(" + marker + ")");
	}
}

// 객체 -> 생성자 순서

class House{
	Window w1 = new Window(1); //new 생성자(); => 디폴트 생성자(선언하지 않아도 자동선언된다) , 
							   //new 생성자(매개변수);
	House(){ //생성자
		System.out.println("House()");
		w3 = new Window(2);
	}
	Window w3 = new Window(3);
	void f() {
		System.out.println("f()");
	}
}
public class InitSample {    // 클래스 안에 자기 자신의 객체가 아닌 다른 클래스의 객체를 생성하는 것을 : 컴포지션이라 한다.

	public static void main(String[] args) {
		
		House h = new House();
		h.f();
	}

}
